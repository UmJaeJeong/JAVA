package sec_verify03;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
	
	@Override
	public void smartSkill() {
		System.out.println("Smart����� �����մϴ�.");
	}
	
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
		
		if(this.volume==10) {
			System.out.println("Television ������ �ִ�ġ ���� "+MAX_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
		}
		else if(this.volume==0){
			System.out.println("Television ������ �ּ�ġ ���� "+MIN_VOLUME+"�Դϴ�. ������ "+this.volume+"���� �����մϴ�!");
			System.out.println("���� TV ���� : "+this.volume);
		}else {
			System.out.println("���� TV ���� : "+this.volume);

		}
	}
}
