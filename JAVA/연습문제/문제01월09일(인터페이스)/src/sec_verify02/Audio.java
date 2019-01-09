package sec_verify02;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(this.volume == 0 && volume>0) {
			System.out.println("���� �����մϴ�.");
			this.volume = volume;
			return;
		}
		this.volume = volume;
		
		if(this.volume>0) {
			System.out.println("Audio ������ �ִ�ġ ���� "+MAX_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
		}
		else if(this.volume==0){
			System.out.println("Audio ������ �ּ�ġ ���� "+MIN_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
			System.out.println("���� ó�� �մϴ�.");
		}
	}
}
