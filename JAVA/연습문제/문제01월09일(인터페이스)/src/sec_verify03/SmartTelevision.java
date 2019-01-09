package sec_verify03;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
	@Override
	public void smartSkill() {
		System.out.println("Smart기능을 시작합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}
	
	@Override
	public void setVolume(int volume) {

		this.volume = volume;
		
		if(this.volume==10) {
			System.out.println("Television 볼륨의 최대치 값은 "+MAX_VOLUME+"입니다. 볼륨을 "+this.volume+"으로 지정합니다!");
			System.out.println("현재 TV 볼륨 : "+this.volume);
		}
		else if(this.volume==0){
			System.out.println("Television 볼륨의 최소치 값은 "+MIN_VOLUME+"입니다. 볼륨을 "+this.volume+"으로 지정합니다!");
			System.out.println("현재 TV 볼륨 : "+this.volume);
		}else {
			System.out.println("현재 TV 볼륨 : "+this.volume);

		}
	}
}
