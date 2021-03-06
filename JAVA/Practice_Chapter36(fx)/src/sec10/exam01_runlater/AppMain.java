package sec10.exam01_runlater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		
		//외부에서 작성한 CSS파일을 Scene에 적용한다.
		//scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setTitle("AnchorPaneExample");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
