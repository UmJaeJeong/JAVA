package sec06.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.WindowBuilder;

public class RootController implements Initializable {

	@FXML private CheckBox chk1;	//CheckBox컨트롤 참조
	@FXML private CheckBox chk2;	//CheckBox컨트롤 참조
	//CheckBox(다중선택)의 체크됨에 따라 보여지게 될 ImageView
	@FXML private ImageView chkImageView;
	@FXML private ToggleGroup group; //RadioButton이 속한 ToggleGroup
	//RadioButton(단일선택)의 속성감시에 의해 이미지를 나타나게 될 ImageView
	@FXML private ImageView radioImageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//ToggleGroup에 속해 있는 RadioButton을 속성감시를 통해 ImageView에 Image가
		//뿌려지도록 한다. RadioButton이 바뀔때 마다 ChangeListener가 발생하여 root.fxml
		//파일에 있는 RadioButton에 있는 userData="" 속성을 이용해서 파일이름을 지정한후.
		//ImageView에 뿌려준다.
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				System.out.println("Changed");
				Image image = new Image(getClass().getResource("images/"+
				newValue.getUserData().toString()).toString());
				radioImageView.setImage(image);
				//radioImageView.setImage(new Image(getClass().
				//getResource("images/"+newValue.getUserData().toString()).toString());
			}
		});
	}
	
	public void handleChkAction(ActionEvent event) {
		if(chk1.isSelected() && chk2.isSelected()) {
			//ImageView의 setImage의 매개값으로 Image객체를 주면 되는 데 현재 파일을
			//기준으로 상대경롤ㄹ 얻어온다. 여기서 기억할 것은 Image의 매개값을
			//String타입의 문자열 즉 URL이다. 하여 toString()을 호ㅜㄹ해줬다.
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		}else if(chk1.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));

		}else if(chk2.isSelected()){
			chkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			chkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));

		}
	}
	
	//버튼 클릭시 종료를 위한 이벤트	
	public void handleBtnExitAction(ActionEvent event) {
		//System.out.println("버튼 클릭으로 어플리케이션 종료");
		//둘중 아무거나 사용해도 상관없다.
		Platform.exit();
		//System.exit(0);
	}
}
