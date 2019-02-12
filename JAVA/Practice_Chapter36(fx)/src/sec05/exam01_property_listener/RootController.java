package sec05.exam01_property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	
	//FXML의 컨트롤을 참조한다.
	@FXML Label label1;
	@FXML Label label2;
	//Slider는 0.0에서 100.0의 값을 지닌다.
	@FXML private Slider slider;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Thread.currentThread().getName());
		//slider컨트롤의 속성값을 감시하기 위해 valueProperty()에 ChangeListener를 등록한다.
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			/*
			 * oldValue는 변경되기 이전값. newValue는 변경된 값을 의미한다. 아울러,
			 *<? extends Number>는 제네릭 와일드 카드 타입으로 Number클래스나
			 *Number를 상속받는 하위클래스만 오도록 상위타입 제한을 의미한다.
			 *제네릭에서 이미 학습한바 있다.
			 */
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//Slider의 값의 변경(속성 감시)에 따라 Label컨트롤의 Font설정의 값을 매핑함으로써
				//글자의 크기가 바뀌게 되는 것이다.
				label1.setFont(new Font(newValue.doubleValue()));
				label2.setFont(new Font(newValue.doubleValue()));
				System.out.println("변경전 값 : "+oldValue.doubleValue());
				System.out.println("변경전 값 : "+newValue.doubleValue());
			}
		});
	}
}
