package sec03.exam03_borderpane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML
	private Button send_btn;

	@FXML
	private Button file_btn;
	@FXML
	private Button capture_btn;
	@FXML
	private Button emoticon_btn;
	@FXML
	private Button search_btn;

	@FXML
	private TextArea text_area;

	@FXML
	private TextField text_field;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		send_btn.setOnAction(event -> Send(event));		//������ ��ư �̺�Ʈ
		file_btn.setOnAction(event -> File_trans(event));	//�������� ��ư �̺�Ʈ
		capture_btn.setOnAction(event -> Capture(event));	//ĸ�� ��ư �̺�Ʈ
		emoticon_btn.setOnAction(event -> Emoticon(event));	//�̸�Ƽ�� ��ư �̺�Ʈ
		search_btn.setOnAction(event -> Search(event));	//�˻� ��ư �̺�Ʈ 

		text_field.setOnAction(event -> Send(event));	//text_field���� EnterŰ ������ ����
	}

	public void Send(ActionEvent event) {
		String answer = text_area.getText() + text_field.getText() + "\n";
		text_field.clear();
		text_area.setText(answer);
	}

	public void File_trans(ActionEvent event) {
		text_area.setText(text_area.getText()+"���� �����ϱ�!!\n");
	}

	public void Capture(ActionEvent event) {
		text_area.setText(text_area.getText()+"ĸ���ϱ�  ��ġ~ vvv�ԯ�~~\n");

	}

	public void Emoticon(ActionEvent event) {
		text_area.setText(text_area.getText()+"�̸�Ƽ�� ������  >_<\n");

	}
	public void Search(ActionEvent event) {
		text_area.setText(text_area.getText()+"�˻��ϱ�! ... �˻��� ....\n");
	}

}
