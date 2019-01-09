package sec_verify02;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");

	}
	
	@Override
	public void setVolume(int volume) {

		this.volume = volume;
		
		if(this.volume>0) {
			System.out.println("Television ������ �ִ�ġ ���� "+MAX_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
		}
		else if(this.volume==0){
			System.out.println("Television ������ �ּ�ġ ���� "+MIN_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
			System.out.println("���� ó�� �մϴ�.");
		}
	}
}
