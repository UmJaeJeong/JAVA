package sec02_exam;

public class Tv {
	//Tv�� �Ӽ�(�������) �ٸ����� �ʵ��� �Ѵ�.
	String color;
	boolean power;
	int channel;
	
	//����޼���(�Լ�)
	//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {
		this.power = !this.power;
	}
	
	//Tv�� ä���� ���̴� ����� �ϴ� �޼���
	public void channelUp() {
		++this.channel;
	}
	
	
	//Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("ä���� �������� �����ϴ�.");
		}
		--this.channel;

	}
}
