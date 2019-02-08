package sec02.exam02_fxml_layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * FXML을 이용한 레이아웃 배치함. 자바 코드와 완전 분리됨
		 */
		//root.fxml에 작성된 데로 parent 즉, 컨테이너와 컨트롤을 생성해라
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
