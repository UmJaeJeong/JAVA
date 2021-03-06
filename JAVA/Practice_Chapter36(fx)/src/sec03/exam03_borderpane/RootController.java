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
		send_btn.setOnAction(event -> Send(event));		//보내기 버튼 이벤트
		file_btn.setOnAction(event -> File_trans(event));	//파일전송 버튼 이벤트
		capture_btn.setOnAction(event -> Capture(event));	//캡쳐 버튼 이벤트
		emoticon_btn.setOnAction(event -> Emoticon(event));	//이모티콘 버튼 이벤트
		search_btn.setOnAction(event -> Search(event));	//검색 버튼 이벤트 

		text_field.setOnAction(event -> Send(event));	//text_field에서 Enter키 누를시 전송
	}

	public void Send(ActionEvent event) {
		String answer = text_area.getText() + text_field.getText() + "\n";
		text_field.clear();
		text_area.setText(answer);
	}

	public void File_trans(ActionEvent event) {
		text_area.setText(text_area.getText()+"파일 전송하기!!\n");
	}

	public void Capture(ActionEvent event) {
		text_area.setText(text_area.getText()+"캡쳐하기  김치~ vvv촬캌~~\n");

	}

	public void Emoticon(ActionEvent event) {
		text_area.setText(text_area.getText()+"이모티콘 보내기  >_<\n");

	}
	public void Search(ActionEvent event) {
		text_area.setText(text_area.getText()+"검색하기! ... 검색중 ....\n");
	}

}
