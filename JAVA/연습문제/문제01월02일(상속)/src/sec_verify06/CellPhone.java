package sec_verify06;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("��ȭ�� �����ϴ�");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String send) {
		System.out.println("�ڱ�: "+send);
	}
	void receiveVoice(String recive) {
		System.out.println("����"+recive);

	}
	void hangUp() {
		System.out.println("�ڱ�: ��������");
	}
}
