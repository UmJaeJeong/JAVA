package sec03_exam_captionTv;

public class Tv {
	boolean power; //��������(on/off)
	int channel=10;		//ä��
	
	public Tv() {
		super();//Object������ ȣ��
		System.out.println("����Ŭ���� ������ ȣ��");
	}
	
	
	//�������
	public void power() {
		this.power = !power;
		System.out.println("����Ŭ���� Tv�� power�޼��带 ȣ���Ͽ����ϴ�.");
	}
	
	
	//ä�� �� �ٿ� ���
	public void ChannelUp() {
		++this.channel;
		System.out.println("����Ŭ���� Tv�� ChannelUp�޼��带 ȣ���Ͽ����ϴ�.");
	}
	
	
	public void ChannelDown() {
		--this.channel;
		System.out.println("����Ŭ���� Tv�� ChannelDown�޼��带 ȣ���Ͽ����ϴ�.");
	}
}
