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
	private boolean stop; // �÷��� ����

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// �̺�Ʈ ó�� �κ�(���ٽ�)
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
					//��� �ý����� �ð��� ���´�.
					String strTime = sdf.format(new Date());
					System.out.println("run()���� ������� : "
							+Thread.currentThread().getName());
					/*
					 * �۾������尡 ���� UI�� �����ϴ� �ڵ尡 ���� ���ܰ� �߻��ϴ� ����
					 * Ȯ���� �� �ִ�.
					 * lblTime.setText(strTime);
					 * System.out.println("����ð� :"+strTime );
					 * 
					 * �۾������尡 ��������� �ý������κ��� �ð��� ������ �װ��� �̺�Ʈ ť��
					 * ������ ���ָ� JavaFXApplication Thread�� �� �̺�Ʈ�� �����ͼ�
					 * Platform.runLater()�� �����Ѵ�.
					 * �Ͽ�, UI�� �����ϴµ� �� ������ ���� ���̴�.
					 *���ٽ�
					 */
					Platform.runLater(()->{
						System.out.println("runLater()ȣ��");
						System.out.println("run()���� ������� : "
								+Thread.currentThread().getName());
						lblTime.setText(strTime);
					});
					//���� �͸�����ü ����
					/*
					 * Platform.runLater(new Runnable() {
					 * 
					 * @Override public void run() { ystem.out.println("runLater()ȣ��");
					 * System.out.println("run()���� ������� : " +Thread.currentThread().getName());
					 * lblTime.setText(strTime); } });
					 */
					//�����尡 �ʹ� ���� ����ǹǷ� sleep()�� ȣ����
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		//���� ����
		thread.setDaemon(true);
		//�۾������� ����
		thread.start();
	}
	
	public void handleBtnbtnStop(ActionEvent event) {
		stop = true;
		//Platform.exit();
	}
}
