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
		// 재생 소스(Media)을 생성함
		// Media media = new
		// Media(getClass().getResource("media/너무너무너무.mp3").toString());
		Media media = new Media(getClass().getResource("media/임요환전략.mp4").toString());

		// MediaPlayer가 재새할 소스를 매개값을 가지고 MediaPlayer를 생성함.
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		// MediaPlayer가 재생하는 내용을 mediaView에 보여주고자 설정ㅎ마.
		mediaView.setMediaPlayer(mediaPlayer);

		// 소스분석이 끝나고 Ready()상태가 되면 아래와 같이 자동실행
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDisable메서드 매개값이 true이면 비활성화, false이면 활성화를 해준다.
				btnPaly.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);

				// 재생정도를 미디어슬라이더에 최고값과 최소값을 초단위로 매핑함.
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				/*
				 * MedaiPlayer의 현재시간을 속성감시를 한다. 시간이기에 제네릭타입은Duration 이다. 재생이 되면서 currentTime이
				 * 변경되면, 그 값은newValue에 계속 들어가게 된다. 이 currentTime을 ProgressBar나
				 * ProgressIndicator에 나타내기 위해서는 0.0~1.0사이의 값으로 환산하여 나타내어 줘야 한다.
				 */

				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						// 현재 재생시간 /총 재생 시간을 하면 0.0~1.0이 나올 것이다.
						double progress = mediaPlayer.getCurrentTime().toSeconds()
								/ mediaPlayer.getTotalDuration().toSeconds();

						// 0.0~1.0사이의 값을 각각 설정해 준다.
						progressBar.setProgress(progress);
						progressIndiator.setProgress(progress);
						// 동영상의 재생정도를 나타낸다.
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

						// 재생시간을 Label에 표시하기 위한 설정(double타입을 보기좋게 int타입으로
						// (강제변환)
						labelTime.setText((int) mediaPlayer.getCurrentTime().toSeconds() + "/"
								+ (int) mediaPlayer.getTotalDuration().toSeconds() + "초");

						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

					}
				});

			}
		});

		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

				// 슬라이더바 클릭할 경우 또는 슬라이더바에서 땟을때만 발생
				/*
				 * sliderMedia.setOnMouseClicked(event -> {
				 * mediaPlayer.seek(Duration.seconds((double) newValue)); });
				 */
				
				if (sliderMedia.isValueChanging() || sliderMedia.isPressed()) {
					mediaPlayer.seek(Duration.seconds((double) newValue));
				}

			}
		});

		// 미디어 소스가 실해되고 있을때를 감지해서 실행할 내용을 람다식으로 제공함
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

			// 문제는 재생이 완료가 되어도 재생버튼이 활성화가 되어 클릭이 되지만,.
			// 재생이 되질 않는다 이유는 재생완료 시점에 그 소스의 상태가 머물러
			// 있기 때문이다. 하여, 명시적으로 stop()을 호출하고 그 소스의 시간을
			// 맨 첨으로 돌려주는 코드를 코딩해야한다. 하여, 위에 선언한 플래그
			// 변수를 true로 설정한다.
			endofMedia = true;

			// 강제적으로 1.0을 설정하여 완료(Done)상태가 나오도록 하자.
			progressBar.setProgress(1.0);
			progressIndiator.setProgress(1.0);

		});

		btnPaly.setOnAction(event -> {
			if (endofMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endofMedia = false; // 플래그변수로 되돌린다.
			}
			mediaPlayer.play();
		});
		/*
		 * SliderVolume이 변경되었을때 볼륨의 크기를 조절하는 속성감시 Slider의 value의 범위는 0.0~100.0이다 하지만,
		 * mediaPlayer의 vlaue의 범위는 0.0~1.0이기 때문에 100.0으로 나눈다.
		 * 
		 */
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// mediaPlaye.setVolume(newValue.doubleValue()/100.0);
				// 볼륨조정값
				double volume = sliderVolume.getValue() / 100.0;
				mediaPlayer.setVolume(volume);
				System.out.println(newValue);

			}
		});

		// 볼륨값을 50으로 기본지정
		sliderVolume.setValue(50.0);

		// Pause버튼을 클릭했을때 동영상이 일시정지하는 이벤트처리 코드
		btnStop.setOnAction(event -> mediaPlayer.stop());
		// Stop버튼을 클릭했을때 동영상이 일시정지하는 이벤트처리 코드
		btnPause.setOnAction(event -> mediaPlayer.pause());

	}
}
