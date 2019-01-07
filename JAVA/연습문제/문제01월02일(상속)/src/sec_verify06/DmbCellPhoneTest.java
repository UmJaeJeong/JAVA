package sec_verify06;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dp = new DmbCellPhone("자바폰","검정",10);
		dp.powerOn();
		dp.bell();
		dp.hangUp();
		dp.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dp.sendVoice("아~ 예 반갑습니다.");
		dp.powerOff();
		dp.turnonDmb();
		dp.ChangeChannelDmb(12);
		dp.turnOffDmb();
	}

}
