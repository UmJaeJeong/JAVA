package sec_verify04;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.sendSMS();
		sp.receiveSMS();
		sp.play();
		sp.stop();
		System.out.println("PDA�� ���� ����� �̿��Ͽ� 3�� 5�� ���մϴ�. ��� : "+sp.calculate(3, 5));
		sp.scheduler();
		sp.applicationManager();
	}

}
