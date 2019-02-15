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
		//재생할 소스(Media)를 생성함
		//동영상
		Media media = new Media(getClass().getResource("media/임요환전략.mp4").toString());
		//Media media = new Media(getClass().getResource("media/피고인.mp4").toString());
		//오디오
		//Media media = new Media(getClass().getResource("media/너무너무너무.mp3").toString());
		
		//MediaPlayer가 재생할 소스를 매개값을 가지고 MediaPlayer를 생성함
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaVeiw.setMediaPlayer(mediaPlayer);
		//소스가 분석도 안된 상태에서 아래와 같이 play()를 호출하면 안됨.
		//mediaPlayer.play();
		
		//소스분석이 끝나고  Ready상태가 되면 아래와 같이 자동 실행한다,(직접  익명구현객체 생성)
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				//setDisable메서드의 매개값이 treu이면 비활성화, false이면 활성화를 해준다.
				btnPlay.setDisable(false);	//Play버트 활성화
				btnPause.setDisable(true);	//Pause버튼 비활성화
				btnStop.setDisable(true);	//Pause버튼 비활성화
				
			}
		});
		//미디어 소스가 재샘(play)상태가 되어씅ㄹ떄 실행할 내용을 람다식으로 제공함

		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true);	//Play버트 활성화
			btnPause.setDisable(false);	//Pause버튼 비활성화
			btnStop.setDisable(false);	//Pause버튼 비활성화
		});
		//미디어 소스가 일시정지(pause)상태가 되어씅ㄹ떄 실행할 내용을 람다식으로 제공함
		mediaPlayer.setOnPaused(()->{
			btnPlay.setDisable(false);	
			btnPause.setDisable(true);	
			btnStop.setDisable(false);	
		});
		//미디어 소스가 정지(stop)상태가 되었을때 실행할 내용을 람다식으로 제공함
		mediaPlayer.setOnStopped(()->{
			btnPlay.setDisable(false);	
			btnPause.setDisable(false);	
			btnStop.setDisable(true);	
		});
		
		//미디어 소스가 재새잉 완료가 되었을때 실행할 내용을 람다식으로 제공함.
		mediaPlayer.setOnEndOfMedia(()->{
			btnPlay.setDisable(true);	//Play버트 활성화
			btnPause.setDisable(false);	//Pause버튼 비활성화
			btnStop.setDisable(false);	//Pause버튼 비활성화
			//문제는 재생이 완료가 되어도 재생버튼이 활성화가 되어 클릭이 되지만,.
			//재생이 되질 않는다 이유는 재생완료 시점에 그 소스의 상태가 머물러
			//있기 때문이다. 하여, 명시적으로 stop()을 호출하고 그 소스의 시간을
			//맨 첨으로 돌려주는 코드를 코딩해야한다. 하여, 위에 선언한 플래그
			//변수를 true로 설정한다.
			endofMedia=true;
		});
		btnPlay.setOnAction(event ->{
			//플래그 변수가 true가 되었다는 것은 미디어상태가 재생완료(endofMedia)상태를 가진다.
			//하여 아래와 같이 명시적으로 stop()를 호출하여주고, 미디어의 처음 시간으로 돌려주는
			//코드를 추가해준다.
			if(endofMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endofMedia = false;	//다시 플래그 변수를 false로 돌린다.
			}
			mediaPlayer.play();
		});
		
		btnPause.setOnAction(even-> mediaPlayer.pause());
		btnStop.setOnAction(even-> mediaPlayer.stop());


	}
}
