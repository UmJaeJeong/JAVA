package sec06.exam03_view;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	// �ʵ��� Ÿ���� SimpleStringProperty�̴�. FX�Ӽ� Ÿ���� Ŭ������ Ÿ������ �����ߴ�.
	// ������ �Ӽ����ø� ���ؼ� ���� �о�ö� ���ϰ� �ϱ� ���ؼ��̴�.(FX API����)
	private SimpleStringProperty smartPhone; // ���̺�� �÷���
	private SimpleStringProperty image; // ���̺�� �÷���.

	// ������ ����
	public Phone() {
		this.smartPhone = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
	}

	public Phone(String smartPhone, String image) {
		// ����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
		this.smartPhone = new SimpleStringProperty(smartPhone);
		// ����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
		this.image = new SimpleStringProperty(image);
	}

	// Getter, Setter����
	// �ָ��� ���� ���ϰ��� �Ű����� String�̹Ƿ�SimpleStringProperty��ü�� get()�޼����
	// set()�޼��带 �̿����� �������.
	public String getSmartPhone() {
		return smartPhone.get();

	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}

	public String getImage() {
		return image.get();

	}

	public void setImage(String image) {
		this.image.set(image);
	}

}
