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
		System.out.println("PDA의 계산기 기능을 이용하여 3과 5를 더합니다. 결과 : "+sp.calculate(3, 5));
		sp.scheduler();
		sp.applicationManager();
	}

}
