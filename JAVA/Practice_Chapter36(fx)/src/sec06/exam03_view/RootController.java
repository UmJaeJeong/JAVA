package sec06.exam03_view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	// root.fxml파일의 컨트롤의 속성을 참조함.
	@FXML
	private ListView<String> listView; // ListView는 제네릭타입임.
	// Phone객체를 지니도록 한다. TableView의 하나의 행은 곧 하나의 객체를 의미한다고 했다.
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;
	@FXML
	private Button btnOk;
	@FXML
	private Button btnCancel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// ListView의 값으로 String을 가지는 observableArrayList컬렉션을 제공
		// 인덱스가 0부터 6까지이다.
		listView.setItems(
				FXCollections.observableArrayList("갤럭시S1", "갤럭시S2", "갤럭시S3", "갤럭시S4", "갤럭시S5", "갤럭시S6", "갤럭시S7"));
		// TableView에 표시될 행값을 객체로 제공하기 위해 컬렉션 생성
		// 7개의 객체가 생성되었으니, 7개의 행(row)이 생성될 것이다.
		ObservableList<Phone> phoneList = FXCollections.observableArrayList(new Phone("갤럭시S1", "phone01.png"),
				new Phone("갤럭시S2", "phone02.png"), new Phone("갤럭시S3", "phone03.png"), new Phone("갤럭시S4", "phone04.png"),
				new Phone("갤럭시S5", "phone05.png"), new Phone("갤럭시S6", "phone06.png"),
				new Phone("갤럭시S7", "phone07.png"));
		// TableView의 해당 컬럼을 얻어와서 그 컬럼에 행으로 들어갈 cell을 만들고 그 값을
		// Phone객체의 필드와 매핑을 해주는 작업이다.
		TableColumn tcSmartPhone = tableView.getColumns().get(0); // 0번 컬럼을 얻어온다.
		// 행의 값을 Phone의 smartPhone필드와 매핑한다.
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment : CENTER;"); // 인라인CSS스타일이다. 뒤에 한다.

		TableColumn tcImage = tableView.getColumns().get(1); // 1번 컬럼을 얻어온다.
		// 행의 값을 Phone의 image필드와 매핑한다.
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment : CENTER;");
		// 위와 같이 설계된 매핑을 토대로 observableArrayList컬렉션을을
		// TableView의 값으로 지정한다.
		tableView.setItems(phoneList);

		// ListView의 속성감시 Change리스너 등록함.
		// 사용자로부터 ListView의 항목이 선택되면 자동 호출된다.
		// selectedIndexProperty()는 선택된 항목의 인덱스를 리턴한다.
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// ListView에서 항목이 선택되어 인덱스가 바뀌면 tableView가 리턴된 인덱스를
				// 매개값으로 주면 TableView의 행도 자동 바뀌게 하였다.
				System.out.println("List뷰에서 넘어온 인덱스값 : " + newValue.intValue());
				// 인덱스가 매개값이다.
				tableView.getSelectionModel().select(newValue.intValue());
				// 넘어온 인덱스가 화면상 보이지 않을수도 있으니 보이게끔 스크롤을 설정한다.
				// 주석처리하고 실행해보자.
				tableView.scrollTo(newValue.intValue());
			}
		});
		// TableView의 항목 선택에 따라 값이 변할 속성 감시이다.
		// 역시, selectedIndexProperty()로 인덱스를 가지고 속성을 감시한다.
		// 인덱스에 따라 이미지뷰에 이미지가 변하게끔 하는 것이다.
		// 이렇게 인덱스를 이용하면 Image객체의 URL을 만들때 제약이 따를 수도 있다.
		// 하여 방법 2를 사용하는 것을 권장한다.
		// 방법1
		/*
		 * tableView.getSelectionModel().selectedIndexProperty().addListener( new
		 * ChangeListener<Number>(){
		 * 
		 * @Override public void changed(ObservableValue<? extends Number> observable,
		 * Number oldValue, Number newValue) { if(newValue != null) {
		 * imageView.setImage(new Image(getClass(). getResource("images/phone0" +
		 * newValue.intValue() + ".png").toString())); } } });
		 */
		// 방법2 -- selectedItemProperty()는 인덱스가 아니라 Phone 즉, 아이템의 속성이 넘어온다.
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				// System.out.println("changed호출" + newValue);
				if (newValue != null) {
					System.out.println("리스트뷰1");
					// selectedItemProperty()를 이용해서 넘어온 Phone을 이용해 이미지를
					// 변하게끔 하였다.
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));

					// listView.getSelectionModel().select(tableView.getSelectionModel().
					// getSelectedIndex());;
					// 경로 출력
					System.out.println("images/" + newValue.getImage().toString());
					System.out.println(tableView.getSelectionModel().getSelectedIndex());
				}
			}
		});
		// 버튼 이벤트 처리(람다식)
		btnOk.setOnAction(event -> handleBtnOkAction(event));
		btnCancel.setOnAction(event -> handleBtnCancelAction(event));
	}

	// ListView와 TableView에 선택되어진 것을 확인 버튼을 누르면 콘솔창에 표시함.
	public void handleBtnOkAction(ActionEvent event) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView에 선택된 스마트폰 : " + item);

		// TableView의 행은 Phone객체이다. 하여 Phone으로 받아줘야 된다.
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView 선택된 스마트폰 : " + phone.getSmartPhone());
		System.out.println("TableView 선택된 이미지 : " + phone.getImage());
	}

	// 어플리케이션 종료
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
}