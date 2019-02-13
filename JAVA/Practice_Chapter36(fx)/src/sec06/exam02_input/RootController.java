package sec06.exam02_input;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {

	//root.fxml파일의 컨트롤의 속성을 참조함.
	@FXML private TextField txtTitle;	//제목
	@FXML private PasswordField txtPassword;	//비밀번호
	//콤보박스에 리스트 내용이 string타입이므로 제네릭 선언
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea txtContent;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleBtnReAction(ActionEvent event) {
		String title = txtTitle.getText();
		System.out.println("제목 : "+title);
		
		String password = txtPassword.getText();	//비밀번호
		//콤보박스에 리스트 내용이 string타입이므로 제네릭 선언.getText();
		System.out.println("비밀번호 : "+password);
		
		String strPublic = comboPublic.getValue();
		if(strPublic !=null) {
			System.out.println("공개 여부  :"+strPublic);
		}
		//DataPicker는 사용자로부터 날짜가 선택이 되어야지만 그값을
		//LocalDate로 리턴을 한다. 하지만, 아무선택을 할지 않았다면 null이
		//리턴되어지므로 유효성 검사를 해야한다.
		LocalDate localDate = dateExit.getValue();
		if(localDate !=null) System.out.println("게시 종료일 : "+localDate.toString());
		
		String content = txtContent.getText();
		System.out.println("내용 : "+content);
		}

	//어플리케이션 종료
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
}
