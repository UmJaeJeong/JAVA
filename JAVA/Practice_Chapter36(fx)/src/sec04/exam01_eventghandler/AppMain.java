package sec04.exam01_eventghandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);	//���� ���� ����
		root.setAlignment(Pos.CENTER);	//��Ʈ�ѵ��� �߾�����
		root.setSpacing(20);	//��Ʈ���� ������ 20�ȼ��� ����
		
		Button btn1 = new Button();		//��ư ��Ʈ�ѷ� ����
		btn1.setText("��ư1");
		Button btn2 = new Button();		//��ư ��Ʈ�ѷ� ����
		btn2.setText("��ư2");
		
		//root.getChildren().add(btn1);	
		//root.getChildren().add(btn2);	
		root.getChildren().addAll(btn1, btn2);
		
		Scene scene = new Scene(root);	//Scene����
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//�̺�Ʈó�� ���
		/*��ư���� Action�̺�Ʈ�� �߻��ϸ�, �̸� ó������ �ڵ鷯�� ��ư�� ������ش�.
		 * �̰��� ������ ����̶�� �ߴ�. �׷� �� EventHanlder�� ���׸��������̽��̸鼭.
		 * �ƿ﷯ �Լ����������̽���. ��, handle()�޼��带 �ϳ��� ������� �ִ�.
		 * �Ͽ� �� handle()�޼��縦 �������ָ� ��ư���� �̺�Ʈ�� �߻��ϸ� �װ��� handle()
		 * ���� �ִ� �ڵ尡 ����Ǵ� ���̴�.
		 * 
		 */
		
		/*
		 * btn1.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("��ư1�� Ŭ������"); } });
		 */
		//���ٽ����� �ۼ��ϴ� �� �ڵ尡 ���� �پ��� ���� �˼��� �ִ�.
		btn1.setOnAction(event -> System.out.println("���ٽ����� �����Ǿ��� ��ư1 Ŭ��"));
		
		
		/*
		 * btn2.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("��ư2�� Ŭ������"); } });
		 */
		btn2.setOnAction(event -> System.out.println("���ٽ����� �����Ǿ��� ��ư2 Ŭ��"));
		
		//������â�� X��ư�� �������� �̺�Ʈ ó��
		primaryStage.setOnCloseRequest(event -> System.out.println("������â�� ���� Ŭ��"));


	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
