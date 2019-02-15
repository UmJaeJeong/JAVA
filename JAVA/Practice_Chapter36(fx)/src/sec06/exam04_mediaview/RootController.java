package sec06.exam04_mediaview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {


    @FXML
    private ImageView imageVeiw;

    @FXML
    private MediaView mediaVeiw;

    @FXML
    private Button btnStop;

    @FXML
    private Button btnPause;

    @FXML
    private Button btnPlay;
    
    boolean endofMedia=false;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//����� �ҽ�(Media)�� ������
		//������
		Media media = new Media(getClass().getResource("media/�ӿ�ȯ����.mp4").toString());
		//Media media = new Media(getClass().getResource("media/�ǰ���.mp4").toString());
		//�����
		//Media media = new Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());
		
		//MediaPlayer�� ����� �ҽ��� �Ű����� ������ MediaPlayer�� ������
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaVeiw.setMediaPlayer(mediaPlayer);
		//�ҽ��� �м��� �ȵ� ���¿��� �Ʒ��� ���� play()�� ȣ���ϸ� �ȵ�.
		//mediaPlayer.play();
		
		//�ҽ��м��� ������  Ready���°� �Ǹ� �Ʒ��� ���� �ڵ� �����Ѵ�,(����  �͸�����ü ����)
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				//setDisable�޼����� �Ű����� treu�̸� ��Ȱ��ȭ, false�̸� Ȱ��ȭ�� ���ش�.
				btnPlay.setDisable(false);	//Play��Ʈ Ȱ��ȭ
				btnPause.setDisable(true);	//Pause��ư ��Ȱ��ȭ
				btnStop.setDisable(true);	//Pause��ư ��Ȱ��ȭ
				
			}
		});
		//�̵�� �ҽ��� ���(play)���°� �Ǿ���� ������ ������ ���ٽ����� ������

		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true);	//Play��Ʈ Ȱ��ȭ
			btnPause.setDisable(false);	//Pause��ư ��Ȱ��ȭ
			btnStop.setDisable(false);	//Pause��ư ��Ȱ��ȭ
		});
		//�̵�� �ҽ��� �Ͻ�����(pause)���°� �Ǿ���� ������ ������ ���ٽ����� ������
		mediaPlayer.setOnPaused(()->{
			btnPlay.setDisable(false);	
			btnPause.setDisable(true);	
			btnStop.setDisable(false);	
		});
		//�̵�� �ҽ��� ����(stop)���°� �Ǿ����� ������ ������ ���ٽ����� ������
		mediaPlayer.setOnStopped(()->{
			btnPlay.setDisable(false);	
			btnPause.setDisable(false);	
			btnStop.setDisable(true);	
		});
		
		//�̵�� �ҽ��� ����� �Ϸᰡ �Ǿ����� ������ ������ ���ٽ����� ������.
		mediaPlayer.setOnEndOfMedia(()->{
			btnPlay.setDisable(true);	//Play��Ʈ Ȱ��ȭ
			btnPause.setDisable(false);	//Pause��ư ��Ȱ��ȭ
			btnStop.setDisable(false);	//Pause��ư ��Ȱ��ȭ
			//������ ����� �Ϸᰡ �Ǿ �����ư�� Ȱ��ȭ�� �Ǿ� Ŭ���� ������,.
			//����� ���� �ʴ´� ������ ����Ϸ� ������ �� �ҽ��� ���°� �ӹ���
			//�ֱ� �����̴�. �Ͽ�, ��������� stop()�� ȣ���ϰ� �� �ҽ��� �ð���
			//�� ÷���� �����ִ� �ڵ带 �ڵ��ؾ��Ѵ�. �Ͽ�, ���� ������ �÷���
			//������ true�� �����Ѵ�.
			endofMedia=true;
		});
		btnPlay.setOnAction(event ->{
			//�÷��� ������ true�� �Ǿ��ٴ� ���� �̵����°� ����Ϸ�(endofMedia)���¸� ������.
			//�Ͽ� �Ʒ��� ���� ��������� stop()�� ȣ���Ͽ��ְ�, �̵���� ó�� �ð����� �����ִ�
			//�ڵ带 �߰����ش�.
			if(endofMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endofMedia = false;	//�ٽ� �÷��� ������ false�� ������.
			}
			mediaPlayer.play();
		});
		
		btnPause.setOnAction(even-> mediaPlayer.pause());
		btnStop.setOnAction(even-> mediaPlayer.stop());


	}
}
