package sec_verify04;

public class SmartPhone extends PDA implements MobilePhone, MP3{

	@Override
	public void play() {
		System.out.println("MP3�� ������ Ƶ�ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("MP3�� ������ �����մϴ�.");		
	}

	@Override
	public void sendCall() {
		System.out.println("��ȭ�� �ɾ�ϴ�.");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �޽��ϴ�.");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڸ� �����ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڸ� �޽��ϴ�.");
	}
	
	void scheduler() {
		System.out.println("���� ������ �����մϴ�.");
	}
	
	void applicationManager() {
		System.out.println("�ش���� ��ġ �� ������ �����մϴ�.");
	}

}
