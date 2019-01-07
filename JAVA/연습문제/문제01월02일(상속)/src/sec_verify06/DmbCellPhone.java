package sec_verify06;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("모델: "+this.model);
		System.out.println("색상: "+this.color);
		System.out.println("채널: "+this.channel);
		
	}
	
	public void turnonDmb() {
		System.out.println("채널 "+this.channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	public void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을 "+this.channel+"번으로 바꿉니다.");

	}
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
