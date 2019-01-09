package sec_verify02;

public class RemoteControlExample {

	public static void main(String[] args) {
		Audio au = new Audio();
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(10);
		tv.setVolume(0);
		tv.setMute(false);
		tv.turnOff();
		RemoteControl.changeBattery();
		System.out.println();
		au.turnOn();
		au.setVolume(10);
		au.setVolume(0);
		au.setMute(false);
		au.turnOff();
		RemoteControl.changeBattery();
		
		
	}

}
