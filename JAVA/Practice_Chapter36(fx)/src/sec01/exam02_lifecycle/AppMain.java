package sec01.exam02_lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	public AppMain() {
		System.out.println("������ ȣ��");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
	}
	//JavaFX Launcher�����尡 ������
	@Override
	public void init() throws Exception{
		//init()������ UI���� �� �����ϴ� �ڵ尡 ����� ���� �ȵȴ�. ���� �߻��Ѵ�.
		//init()�� �ַ� ���� �Ű����� JavaFX Application�����忡 ������ �������� ���ǰ� �Ѵ�.
		System.out.println("init() ����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
	}
	//���ེ����� JavaFX Application
	@Override
	public void start(Stage primaryStage) throws Exception {
		//start()������ UI���� �� �����ϴ� �ڵ尡 ����Ǿ�� �Ѵ�.
		//��������� start()�� ������ �ؼ� ������ ���� �Ѵ�.
		System.out.println("start() ����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());		
	}
	@Override
	public void stop() throws Exception{
		//������ â�� Xǥ�ø� Ŭ���� �ڵ� ����
		//Application�� ����� �����ؾ��� �ڵ���� �ַ� �ۼ��Ѵ�.
		System.out.println("stop() ����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());	
	}
	
	public static void main(String[] args) {
		System.out.println("main() ����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
		Application.launch(args);	//main�����尡 JavaFX Application �����带 ������
		
	}

	

}
