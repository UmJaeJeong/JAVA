package sec_verify06;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("��: "+this.model);
		System.out.println("����: "+this.color);
		System.out.println("ä��: "+this.channel);
		
	}
	
	public void turnonDmb() {
		System.out.println("ä�� "+this.channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	public void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä���� "+this.channel+"������ �ٲߴϴ�.");

	}
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
}
