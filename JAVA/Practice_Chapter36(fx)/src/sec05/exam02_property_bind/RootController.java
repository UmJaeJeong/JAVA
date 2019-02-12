package sec05.exam02_property_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	//root.fxml������ ��Ʈ���� �Ӽ��� ������
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//BindingsŬ������ �̿��� ���ε�
		//��, ���ʴ� ������ ��Ʈ�ѿ� ������ �ִ� �����̴�.
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
		
		//�ܓ��� ���ε�
		//textArea2.textProperty().bind(textArea1.textProperty());
		
		//�Ʒ��� ���� �ص� ������ BindingsŬ������ �����޼��带 �̿��ϸ� ���ϴ�.
		//textArea2.textProperty().bindBidirectional(textArea1,textProperty());
		
		//�瓇�� ���ε� ����
		//Bindings.unbindBidirectional(textArea1.textProperty(), textArea2.textProperty());
	
	}
	
}
