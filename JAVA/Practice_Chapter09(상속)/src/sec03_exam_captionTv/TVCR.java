package sec03_exam_captionTv;

public class TVCR extends Tv{
	//���԰���
	Vcr vcr = new Vcr();
	
	int channel = 20;
	int counter = vcr.counter;
	public TVCR() {
		//super(); //����Ŭ������ ����ȴ� �����Ϸ��� �ڵ����� ȣ������ 
		//��������� 
		System.out.println("TVCRŬ���� ������ ȣ��");
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public void play() {
		vcr.play();

	}
	
	public void stop() {
		vcr.stop();
	}
	//�ǰ���<<
	public void rew() {
		vcr.rew();

	}
	//�������� >>
	public void ff() {
		vcr.ff();

	}
	//.����޼��带 ������(�������̵�), ����� �׻� ���ƾ��Ѵ�. (�߿�!!!!)
	//��Ӱ��迡�� �������̵��� �̷������ �Ѵ�.
	
	@Override
	public void power() {
		this.power = !power;
		System.out.println("�ڼ�Ŭ���� TVCR�� power�޼��带 ȣ���Ͽ����ϴ�.");
		super.power();//Tv�� power()�� ȣ���Ѱ�
	}
}
