package sec05.exam03_property_bindings;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable{
	//root.fxml������ ��Ʈ���� �Ӽ��� ������
	@FXML private AnchorPane root;
	@FXML private Circle circle;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�Ʒ��� ���ε��� �ϴµ� ����ڰ� ����� ������â�� ũ�� �ϰų� �۰��ص�.
		//AnchorPane�� ���� ���̸� 2�� ������ circle�� X,Y��ǥ�� ���ε��� ���ִ� �ܹ����̴�.
		//�Ͽ�, ����ؼ� �߾ӿ� �߾ӿ� ��ġ�ϰ� �Ǵ� ���̴�.
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));

	}
	
	
}
