package sec01.exam03_stage_scene;





import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	//���ེ���� JavaFX Application
	@Override
	public void start(Stage primaryStage) throws Exception {
		//VBox�� �����̳� Ŭ������ Ŭ������ �� �����̸� �������� ����(��Ʈ��)����
		//��ġ�ϴ� �����̳��̴�.(Parent�� ��ӹ޴´�)
		VBox root = new VBox();
		root.setPrefWidth(500);//���� ����
		root.setPrefHeight(350);//���� ����
		root.setAlignment(Pos.CENTER);//�߾�����
		root.setSpacing(20);	//��ġ�Ǵ� ��Ʈ���� ������ 20�ȼ��� �ϰڴٶ�� �ڵ�
		
		Label label  = new Label();
		label.setText("�ȳ� �ڹ�FX");//Label�� ���� ����
		label.setFont(new Font(50));//����ũ��
		
		Button button = new Button();//��ư����
		button.setText("Ȯ��");//��ư ���� ����
		
		//���ٽ����� ��ư�� Ŭ���� ����ǵ��� �̺�Ʈ ó���� ������ �߰���
		button.setOnAction(event -> Platform.exit());
		
		//�͸�����ü���� �����Ͽ� �̺�Ʈ ����
		/*
		 * button.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent arg0) {
		 * System.out.println("�÷��� ����"); Platform.exit(); }
		 * 
		 * });
		 */
		
		//VBox(��Ʈ �����̳�)�� ��Ʈ�ѵ��� ��ġ�Ѵ�.
		ObservableList list = root.getChildren();
		list.add(new Label("�޷�!"));
		//list.add(button);
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		
		//Scene�� �������� �Ű����� Parent��� �߻�Ŭ�����̴�.
		//�Ͽ� ��ӹ޴� ����Ŭ���� ��� �����̳� Ŭ�������̴�.
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");//������ Ÿ��Ʋ ����
		primaryStage.setScene(scene);//Stage�� scene(���)�� �߰�
		primaryStage.show();//������ �����ֱ�
		
		/*
		 * �� ������ ����
		 * 1. Stage�� ������ �� �� ������â�� �ش��Ѵ�.
		 * 2. �� Stage�� �����Ǹ� ����� �� Scene�� �������ش�.
		 * 3. �׸��� Scene�� �����Ҷ� �Ű����� ��� ParentŬ���������µ�,
		 * 	 �߻�Ŭ�����̹Ƿ� ���� �����̳� Ŭ������ �Ѱ��ش�.
		 * 4. ParentŬ������ ��ӹ޴� �����̳ʿ� ���� ��Ʈ��(����)�� �߰���ġ�Ѵ�.
		 *    �������� �����ϸ� �ȴ�. �ϳ��ϳ� �������ΰ��� �ڿ��� ���� ���´�.
		 */
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
