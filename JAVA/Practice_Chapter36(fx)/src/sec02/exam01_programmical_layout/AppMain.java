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
		 * 컨테이너 설정과 각종 컨트롤들을 자바코드로 만들어짐
		 * (프로그램적 레이아웃형태)
		 */
		
		HBox hbox = new HBox();	//수평으로 컨트롤을 배치하는 HBox루트 컨테이너를 생성
		hbox.setPadding(new Insets(10,10,10,10));//안쪽 여백을 설정한다.
		hbox.setSpacing(10);//컨트롤간의 간격을 10픽셀로 한다.
		
		//글자를 입력할수 있는 TextField컨트롤 생성
		TextField textField = new TextField();
		textField.setPrefWidth(200);//TextField의 가졸길이(폭) 설정
		
		Button button = new Button();//버튼 컨트롤 생성
		button.setText("확인");//qjxms "확인 "글자 추카
		//방법1
		//hbox.getChildren().add(textField);
		//hbox.getChildren().add(button);
		//방법2
		ObservableList list = hbox.getChildren();
		//HBox컨테이너에 컨트롤 추가
		list.add(textField);
		
		list.add(button);
		//화면의 루트컨테이너(Parent)를 Parent클래스를 상속받는 HBox로 설정
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("AppMain");//윈도우 타이틀 설정
		primaryStage.setScene(scene);//윈도우 창에 장면(Scene)을 설정
		primaryStage.show();//윈도우 보여주기
		
	}

	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
