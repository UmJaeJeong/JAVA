package sec01.exam01_applicaition_start;


import javafx.application.Application;
import javafx.stage.Stage;

//Main�� �׻� javafx.application.Application(�߻�Ŭ����)�� ����Ͽ��� �Ѵ�,.
public class AppMain extends Application {
	//ApplicationŬ������ start�� �߻� �޼��带 ������
	@Override
	public void start(Stage primaryStage) {
		String threadName = Thread.currentThread().getName();
		System.out.println("���� ������ : "+threadName);
		primaryStage.show();	//������ â ����
	}

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("���� ������ : "+threadName);
		//�ڹ� FX���ø����̼� �����带 �����Ͽ� start()�� ȣ���Ͽ� �ش�.
		launch(args);
	}
}
