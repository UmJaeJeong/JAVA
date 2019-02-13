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
	// root.fxml������ ��Ʈ���� �Ӽ��� ������.
	@FXML
	private ListView<String> listView; // ListView�� ���׸�Ÿ����.
	// Phone��ü�� ���ϵ��� �Ѵ�. TableView�� �ϳ��� ���� �� �ϳ��� ��ü�� �ǹ��Ѵٰ� �ߴ�.
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
		// ListView�� ������ String�� ������ observableArrayList�÷����� ����
		// �ε����� 0���� 6�����̴�.
		listView.setItems(
				FXCollections.observableArrayList("������S1", "������S2", "������S3", "������S4", "������S5", "������S6", "������S7"));
		// TableView�� ǥ�õ� �ప�� ��ü�� �����ϱ� ���� �÷��� ����
		// 7���� ��ü�� �����Ǿ�����, 7���� ��(row)�� ������ ���̴�.
		ObservableList<Phone> phoneList = FXCollections.observableArrayList(new Phone("������S1", "phone01.png"),
				new Phone("������S2", "phone02.png"), new Phone("������S3", "phone03.png"), new Phone("������S4", "phone04.png"),
				new Phone("������S5", "phone05.png"), new Phone("������S6", "phone06.png"),
				new Phone("������S7", "phone07.png"));
		// TableView�� �ش� �÷��� ���ͼ� �� �÷��� ������ �� cell�� ����� �� ����
		// Phone��ü�� �ʵ�� ������ ���ִ� �۾��̴�.
		TableColumn tcSmartPhone = tableView.getColumns().get(0); // 0�� �÷��� ���´�.
		// ���� ���� Phone�� smartPhone�ʵ�� �����Ѵ�.
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment : CENTER;"); // �ζ���CSS��Ÿ���̴�. �ڿ� �Ѵ�.

		TableColumn tcImage = tableView.getColumns().get(1); // 1�� �÷��� ���´�.
		// ���� ���� Phone�� image�ʵ�� �����Ѵ�.
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment : CENTER;");
		// ���� ���� ����� ������ ���� observableArrayList�÷�������
		// TableView�� ������ �����Ѵ�.
		tableView.setItems(phoneList);

		// ListView�� �Ӽ����� Change������ �����.
		// ����ڷκ��� ListView�� �׸��� ���õǸ� �ڵ� ȣ��ȴ�.
		// selectedIndexProperty()�� ���õ� �׸��� �ε����� �����Ѵ�.
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// ListView���� �׸��� ���õǾ� �ε����� �ٲ�� tableView�� ���ϵ� �ε�����
				// �Ű������� �ָ� TableView�� �൵ �ڵ� �ٲ�� �Ͽ���.
				System.out.println("List�信�� �Ѿ�� �ε����� : " + newValue.intValue());
				// �ε����� �Ű����̴�.
				tableView.getSelectionModel().select(newValue.intValue());
				// �Ѿ�� �ε����� ȭ��� ������ �������� ������ ���̰Բ� ��ũ���� �����Ѵ�.
				// �ּ�ó���ϰ� �����غ���.
				tableView.scrollTo(newValue.intValue());
			}
		});
		// TableView�� �׸� ���ÿ� ���� ���� ���� �Ӽ� �����̴�.
		// ����, selectedIndexProperty()�� �ε����� ������ �Ӽ��� �����Ѵ�.
		// �ε����� ���� �̹����信 �̹����� ���ϰԲ� �ϴ� ���̴�.
		// �̷��� �ε����� �̿��ϸ� Image��ü�� URL�� ���鶧 ������ ���� ���� �ִ�.
		// �Ͽ� ��� 2�� ����ϴ� ���� �����Ѵ�.
		// ���1
		/*
		 * tableView.getSelectionModel().selectedIndexProperty().addListener( new
		 * ChangeListener<Number>(){
		 * 
		 * @Override public void changed(ObservableValue<? extends Number> observable,
		 * Number oldValue, Number newValue) { if(newValue != null) {
		 * imageView.setImage(new Image(getClass(). getResource("images/phone0" +
		 * newValue.intValue() + ".png").toString())); } } });
		 */
		// ���2 -- selectedItemProperty()�� �ε����� �ƴ϶� Phone ��, �������� �Ӽ��� �Ѿ�´�.
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				// System.out.println("changedȣ��" + newValue);
				if (newValue != null) {
					System.out.println("����Ʈ��1");
					// selectedItemProperty()�� �̿��ؼ� �Ѿ�� Phone�� �̿��� �̹�����
					// ���ϰԲ� �Ͽ���.
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));

					// listView.getSelectionModel().select(tableView.getSelectionModel().
					// getSelectedIndex());;
					// ��� ���
					System.out.println("images/" + newValue.getImage().toString());
					System.out.println(tableView.getSelectionModel().getSelectedIndex());
				}
			}
		});
		// ��ư �̺�Ʈ ó��(���ٽ�)
		btnOk.setOnAction(event -> handleBtnOkAction(event));
		btnCancel.setOnAction(event -> handleBtnCancelAction(event));
	}

	// ListView�� TableView�� ���õǾ��� ���� Ȯ�� ��ư�� ������ �ܼ�â�� ǥ����.
	public void handleBtnOkAction(ActionEvent event) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView�� ���õ� ����Ʈ�� : " + item);

		// TableView�� ���� Phone��ü�̴�. �Ͽ� Phone���� �޾���� �ȴ�.
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView ���õ� ����Ʈ�� : " + phone.getSmartPhone());
		System.out.println("TableView ���õ� �̹��� : " + phone.getImage());
	}

	// ���ø����̼� ����
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
}