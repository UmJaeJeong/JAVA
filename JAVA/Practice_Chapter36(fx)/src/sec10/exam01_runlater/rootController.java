package sec10.exam01_runlater;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class rootController implements Initializable {
	@FXML
	private Button btnStart;

	@FXML
	private Button btnStop;

	@FXML
	private Label lblTime;
	private boolean stop; // 플래그 변수

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 처리 부분(람다식)
		btnStart.setOnAction(e -> handleBtnStart(e));
		btnStop.setOnAction(e -> handleBtnbtnStop(e));

	}

	public void handleBtnStart(ActionEvent event) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					//계속 시스템의 시간을 얻어온다.
					String strTime = sdf.format(new Date());
					System.out.println("run()실행 쓰레드명 : "
							+Thread.currentThread().getName());
					/*
					 * 작업스레드가 직접 UI를 변경하는 코드가 들어가면 예외가 발생하는 것을
					 * 확인할 수 있다.
					 * lblTime.setText(strTime);
					 * System.out.println("현재시간 :"+strTime );
					 * 
					 * 작업스레드가 계속적으로 시스템으로부터 시간을 얻어오고 그것을 이벤트 큐에
					 * 저장을 해주면 JavaFXApplication Thread가 그 이벤트를 가져와서
					 * Platform.runLater()를 실행한다.
					 * 하여, UI를 변경하는데 별 문제가 없는 것이다.
					 *람다식
					 */
					Platform.runLater(()->{
						System.out.println("runLater()호출");
						System.out.println("run()실행 쓰레드명 : "
								+Thread.currentThread().getName());
						lblTime.setText(strTime);
					});
					//직접 익명구현객체 생성
					/*
					 * Platform.runLater(new Runnable() {
					 * 
					 * @Override public void run() { ystem.out.println("runLater()호출");
					 * System.out.println("run()실행 쓰레드명 : " +Thread.currentThread().getName());
					 * lblTime.setText(strTime); } });
					 */
					//쓰레드가 너무 빨리 실행되므로 sleep()을 호출함
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		//데몬 설정
		thread.setDaemon(true);
		//작업스레드 시작
		thread.start();
	}
	
	public void handleBtnbtnStop(ActionEvent event) {
		stop = true;
		//Platform.exit();
	}
}
