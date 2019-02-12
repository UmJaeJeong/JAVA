package sec03.exam06_gridpane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	@FXML private Button ok_btn;
	@FXML private Button cancel_btn;
	@FXML private TextField id;
	@FXML private PasswordField passwd;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ok_btn.setOnAction(event -> Ok(event));
		cancel_btn.setOnAction(event -> Cancel(event));
	}
	
	public void Ok(ActionEvent event) {
		String str_id= this.id.getText();
		String str_passwd = this.passwd.getText();
		System.out.println("�Է��Ͻ� ID: "+str_id);
		System.out.println("�Է��Ͻ� Passworad: "+str_passwd);
		System.out.println();
	}
	
	public void Cancel(ActionEvent event) {
		this.id.clear();
		this.passwd.clear();
		System.out.println("��ҹ�ư�� �����̽��ϴ�.");
		System.out.println("�ʱ�ȭ �Ǿ����ϴ�.");
		System.out.println();
	}
	
}
