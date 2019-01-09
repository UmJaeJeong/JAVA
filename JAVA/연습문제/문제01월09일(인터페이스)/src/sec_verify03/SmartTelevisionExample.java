package sec_verify03;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.setVolume(10);
		stv.setVolume(0);
		stv.setVolume(8);
		stv.setMute(false);
		stv.setMute(true);
		RemoteControl.changeBattery();
		
		stv.smartSkill();
		stv.search("www.naver.com");

	}

}
