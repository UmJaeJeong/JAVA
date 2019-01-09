package sec_verify02;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(this.volume == 0 && volume>0) {
			System.out.println("무음 해제합니다.");
			this.volume = volume;
			return;
		}
		this.volume = volume;
		
		if(this.volume>0) {
			System.out.println("Audio 볼륨의 최대치 값은 "+MAX_VOLUME+"입니다. 볼륨을 "+this.volume+"으로 지정합니다!");
			System.out.println("현재 TV 볼륨 : "+this.volume);
		}
		else if(this.volume==0){
			System.out.println("Audio 볼륨의 최소치 값은 "+MIN_VOLUME+"입니다. 볼륨을 "+this.volume+"으로 지정합니다!");
			System.out.println("현재 TV 볼륨 : "+this.volume);
			System.out.println("무음 처리 합니다.");
		}
	}
}
