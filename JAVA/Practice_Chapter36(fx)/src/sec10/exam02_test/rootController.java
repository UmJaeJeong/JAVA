package sec10.exam02_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class rootController implements Initializable {

	@FXML
	private Button btnstart;

	@FXML
	private Button btnstop;

	@FXML
	private ProgressBar progressbar;

	@FXML
	private Label label;
	double cur_gaing;
	boolean stop = false;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnstart.setOnAction(e -> Start(e));
		btnstop.setOnAction(e -> Stop(e));

	}

	public void Start(ActionEvent event) {
		stop = false;
		cur_gaing = 0;
		Thread thread = new Thread() {
			public void run() {
				while (!stop) {
					Platform.runLater(() -> {
						progressbar.setProgress(cur_gaing/100);
						label.setText("현재진행 :" + (int)cur_gaing + "%");
						if (cur_gaing == 100) {
							label.setText("진행 완료!");
							stop = true;
						}

					});
					cur_gaing++;
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			};
		};
		thread.setDaemon(true);
		thread.start();
	}

	public void Stop(ActionEvent event) {
		Platform.runLater(() -> {
			label.setText("현재진행 : 진행취소됨");
			stop = true;
		});

	}

}
