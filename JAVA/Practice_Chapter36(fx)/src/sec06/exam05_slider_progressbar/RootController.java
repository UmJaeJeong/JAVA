package sec06.exam05_slider_progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {

	@FXML
	private Button btnPaly;

	@FXML
	private Button btnStop;

	@FXML
	private Label labelTime;

	@FXML
	private ProgressBar progressBar;

	@FXML
	private ImageView imageView;

	@FXML
	private Slider sliderMedia;

	@FXML
	private Button btnPause;

	@FXML
	private ProgressIndicator progressIndiator;

	@FXML
	private Slider sliderVolume;

	@FXML
	private MediaView mediaView;

	boolean endofMedia;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// ��� �ҽ�(Media)�� ������
		// Media media = new
		// Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());
		Media media = new Media(getClass().getResource("media/�ӿ�ȯ����.mp4").toString());

		// MediaPlayer�� ����� �ҽ��� �Ű����� ������ MediaPlayer�� ������.
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		// MediaPlayer�� ����ϴ� ������ mediaView�� �����ְ��� ��������.
		mediaView.setMediaPlayer(mediaPlayer);

		// �ҽ��м��� ������ Ready()���°� �Ǹ� �Ʒ��� ���� �ڵ�����
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDisable�޼��� �Ű����� true�̸� ��Ȱ��ȭ, false�̸� Ȱ��ȭ�� ���ش�.
				btnPaly.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);

				// ��������� �̵����̴��� �ְ��� �ּҰ��� �ʴ����� ������.
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				/*
				 * MedaiPlayer�� ����ð��� �Ӽ����ø� �Ѵ�. �ð��̱⿡ ���׸�Ÿ����Duration �̴�. ����� �Ǹ鼭 currentTime��
				 * ����Ǹ�, �� ����newValue�� ��� ���� �ȴ�. �� currentTime�� ProgressBar��
				 * ProgressIndicator�� ��Ÿ���� ���ؼ��� 0.0~1.0������ ������ ȯ���Ͽ� ��Ÿ���� ��� �Ѵ�.
				 */

				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						// ���� ����ð� /�� ��� �ð��� �ϸ� 0.0~1.0�� ���� ���̴�.
						double progress = mediaPlayer.getCurrentTime().toSeconds()
								/ mediaPlayer.getTotalDuration().toSeconds();

						// 0.0~1.0������ ���� ���� ������ �ش�.
						progressBar.setProgress(progress);
						progressIndiator.setProgress(progress);
						// �������� ��������� ��Ÿ����.
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

						// ����ð��� Label�� ǥ���ϱ� ���� ����(doubleŸ���� �������� intŸ������
						// (������ȯ)
						labelTime.setText((int) mediaPlayer.getCurrentTime().toSeconds() + "/"
								+ (int) mediaPlayer.getTotalDuration().toSeconds() + "��");

						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

					}
				});

			}
		});

		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

				// �����̴��� Ŭ���� ��� �Ǵ� �����̴��ٿ��� �������� �߻�
				/*
				 * sliderMedia.setOnMouseClicked(event -> {
				 * mediaPlayer.seek(Duration.seconds((double) newValue)); });
				 */
				
				if (sliderMedia.isValueChanging() || sliderMedia.isPressed()) {
					mediaPlayer.seek(Duration.seconds((double) newValue));
				}

			}
		});

		// �̵�� �ҽ��� ���صǰ� �������� �����ؼ� ������ ������ ���ٽ����� ������
		mediaPlayer.setOnPlaying(() -> {
			btnPaly.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnPaused(() -> {
			btnPaly.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnStopped(() -> {
			btnPaly.setDisable(false);
			btnPause.setDisable(false);
			btnStop.setDisable(true);
		});

		mediaPlayer.setOnEndOfMedia(() -> {
			btnPaly.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);

			// ������ ����� �Ϸᰡ �Ǿ �����ư�� Ȱ��ȭ�� �Ǿ� Ŭ���� ������,.
			// ����� ���� �ʴ´� ������ ����Ϸ� ������ �� �ҽ��� ���°� �ӹ���
			// �ֱ� �����̴�. �Ͽ�, ��������� stop()�� ȣ���ϰ� �� �ҽ��� �ð���
			// �� ÷���� �����ִ� �ڵ带 �ڵ��ؾ��Ѵ�. �Ͽ�, ���� ������ �÷���
			// ������ true�� �����Ѵ�.
			endofMedia = true;

			// ���������� 1.0�� �����Ͽ� �Ϸ�(Done)���°� �������� ����.
			progressBar.setProgress(1.0);
			progressIndiator.setProgress(1.0);

		});

		btnPaly.setOnAction(event -> {
			if (endofMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endofMedia = false; // �÷��׺����� �ǵ�����.
			}
			mediaPlayer.play();
		});
		/*
		 * SliderVolume�� ����Ǿ����� ������ ũ�⸦ �����ϴ� �Ӽ����� Slider�� value�� ������ 0.0~100.0�̴� ������,
		 * mediaPlayer�� vlaue�� ������ 0.0~1.0�̱� ������ 100.0���� ������.
		 * 
		 */
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// mediaPlaye.setVolume(newValue.doubleValue()/100.0);
				// ����������
				double volume = sliderVolume.getValue() / 100.0;
				mediaPlayer.setVolume(volume);
				System.out.println(newValue);

			}
		});

		// �������� 50���� �⺻����
		sliderVolume.setValue(50.0);

		// Pause��ư�� Ŭ�������� �������� �Ͻ������ϴ� �̺�Ʈó�� �ڵ�
		btnStop.setOnAction(event -> mediaPlayer.stop());
		// Stop��ư�� Ŭ�������� �������� �Ͻ������ϴ� �̺�Ʈó�� �ڵ�
		btnPause.setOnAction(event -> mediaPlayer.pause());

	}
}
