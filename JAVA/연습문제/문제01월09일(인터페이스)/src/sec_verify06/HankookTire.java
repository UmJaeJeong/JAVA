package sec_verify06;

public class HankookTire implements Tire{
	static int i;
	
	@Override
	public void roll() {
		this.i++;
		System.out.println(i+"��° �ѱ� Ÿ�̾ �������ϴ�.");
	}
	
}
