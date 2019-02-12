package sec04.exam02_fxml_controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start메서드 호출");
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));	//로딩을 하면서 Initialize가 실행되는 것이다.
		Scene scene = new Scene(parent);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		//종료시(람다식)
		primaryStage.setOnCloseRequest(event -> System.out.println("종료 클릭"));
	}

	public static void main(String[] args) {
		launch(args);
	}

}