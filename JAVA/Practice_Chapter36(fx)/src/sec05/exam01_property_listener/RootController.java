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
	
	//FXML�� ��Ʈ���� �����Ѵ�.
	@FXML Label label1;
	@FXML Label label2;
	//Slider�� 0.0���� 100.0�� ���� ���Ѵ�.
	@FXML private Slider slider;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Thread.currentThread().getName());
		//slider��Ʈ���� �Ӽ����� �����ϱ� ���� valueProperty()�� ChangeListener�� ����Ѵ�.
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			/*
			 * oldValue�� ����Ǳ� ������. newValue�� ����� ���� �ǹ��Ѵ�. �ƿ﷯,
			 *<? extends Number>�� ���׸� ���ϵ� ī�� Ÿ������ NumberŬ������
			 *Number�� ��ӹ޴� ����Ŭ������ ������ ����Ÿ�� ������ �ǹ��Ѵ�.
			 *���׸����� �̹� �н��ѹ� �ִ�.
			 */
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//Slider�� ���� ����(�Ӽ� ����)�� ���� Label��Ʈ���� Font������ ���� ���������ν�
				//������ ũ�Ⱑ �ٲ�� �Ǵ� ���̴�.
				label1.setFont(new Font(newValue.doubleValue()));
				label2.setFont(new Font(newValue.doubleValue()));
				System.out.println("������ �� : "+oldValue.doubleValue());
				System.out.println("������ �� : "+newValue.doubleValue());
			}
		});
	}
}
