package sec_verify06;

public class KumhoTire implements Tire{
	static int i;
	
	@Override
	public void roll() {
		this.i++;
		System.out.println(i+"��° ��ȣ Ÿ�̾ �������ϴ�.");
		
	}
	
}
