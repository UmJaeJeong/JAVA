package sec_verify06;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전화를 끊습니다");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String send) {
		System.out.println("자기: "+send);
	}
	void receiveVoice(String recive) {
		System.out.println("상대방"+recive);

	}
	void hangUp() {
		System.out.println("자기: 여보세요");
	}
}
