package sec_verify06;

public class KumhoTire implements Tire{
	static int i;
	
	@Override
	public void roll() {
		this.i++;
		System.out.println(i+"번째 금호 타이어가 굴러갑니다.");
		
	}
	
}
