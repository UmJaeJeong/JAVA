package sec04.exam02_fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

//fxml���ϴ� �ϳ��� ��Ʈ�ѷ��� �����Ͽ� �̺�Ʈ ó���� ���� ������ ����ϴµ�, �ݵ�� �ؾ��Ұ���
//Initializable�������̽��� �����ؾ��Ѵٴ� ���� ����ϵ�������.

public class RootController implements Initializable {
	//root.fxml�� ������ ��Ʈ���� fx:id�� �ʵ�� �����Ͽ� �����Ѵ�.
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	//initialize�� �޼���� AppMain.java�� �ε��� ��, FXMLLoader.load()�� ����� �� ��Ʈ�ѷ�
	//��ü�� ����� ����, ��Ʈ�� ������ �̷���� ���� initialize()�� �ڵ� ȣ��ȴ�.

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize�޼��� ȣ��");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//�̺�Ʈ ó�� �ڵ尡 ���� ���ٸ�. ���⿡ ���� �ۼ��� �ص� ������,
				//��������� �̺�Ʈ ó���ڵ�� ����� ���� ���� �޼��带 �ۼ��Ѵ�.
				//�Ͽ�, �Ʒ��� ���� �̺�Ʈ ó�� �޼��带 ȣ���ϴ� �ڵ常 ���⼭
				//�ۼ��ϰ�, �޼���� ���� �ۼ����ֵ��� ����.
				handleBtn1Action(event);
				//System.out.println("��ư1 Ŭ��");
			}
		});
		
		btn2.setOnAction(event -> handleBtn2Action(event));
		
	}
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("��ư1 Ŭ��");
	}
	
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("��ư2 Ŭ��");

	}
	
	public void handlerBtn3Action(ActionEvent event) {
		System.out.println("��ư3 Ŭ��");

	}
}
