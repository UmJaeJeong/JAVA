package sec01_exam_captionTv;

public class Tv {
	boolean power; //��������(on/off)
	int channel;		//ä��
	
	public Tv() {
		System.out.println("����Ŭ���� ������ ȣ��");
	}
	
	//�������
	public void power() {
		this.power = !power;
	}
	//ä�� �� �ٿ� ���
	public void ChannelUp() {
		++this.channel;
	}
	
	public void ChannelDown() {
		--this.channel;
	}
}
