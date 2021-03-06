package sec_verify04;

public class SmartPhone extends PDA implements MobilePhone, MP3{

	@Override
	public void play() {
		System.out.println("MP3로 음악을 틉니다.");
	}

	@Override
	public void stop() {
		System.out.println("MP3로 음악을 중지합니다.");		
	}

	@Override
	public void sendCall() {
		System.out.println("전화를 걸어봅니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받습니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받습니다.");
	}
	
	void scheduler() {
		System.out.println("일정 관리를 시작합니다.");
	}
	
	void applicationManager() {
		System.out.println("해당앱을 설치 및 삭제를 진행합니다.");
	}

}
