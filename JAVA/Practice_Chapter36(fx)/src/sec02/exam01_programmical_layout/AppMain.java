package sec02.exam01_programmical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * �����̳� ������ ���� ��Ʈ�ѵ��� �ڹ��ڵ�� �������
		 * (���α׷��� ���̾ƿ�����)
		 */
		
		HBox hbox = new HBox();	//�������� ��Ʈ���� ��ġ�ϴ� HBox��Ʈ �����̳ʸ� ����
		hbox.setPadding(new Insets(10,10,10,10));//���� ������ �����Ѵ�.
		hbox.setSpacing(10);//��Ʈ�Ѱ��� ������ 10�ȼ��� �Ѵ�.
		
		//���ڸ� �Է��Ҽ� �ִ� TextField��Ʈ�� ����
		TextField textField = new TextField();
		textField.setPrefWidth(200);//TextField�� ��������(��) ����
		
		Button button = new Button();//��ư ��Ʈ�� ����
		button.setText("Ȯ��");//qjxms "Ȯ�� "���� ��ī
		//���1
		//hbox.getChildren().add(textField);
		//hbox.getChildren().add(button);
		//���2
		ObservableList list = hbox.getChildren();
		//HBox�����̳ʿ� ��Ʈ�� �߰�
		list.add(textField);
		
		list.add(button);
		//ȭ���� ��Ʈ�����̳�(Parent)�� ParentŬ������ ��ӹ޴� HBox�� ����
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("AppMain");//������ Ÿ��Ʋ ����
		primaryStage.setScene(scene);//������ â�� ���(Scene)�� ����
		primaryStage.show();//������ �����ֱ�
		
	}

	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
