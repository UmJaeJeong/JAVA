package sec_verify02;

import java.util.Objects;

class Monitor{
	private String model;
	private int inch;
	private int price;
	
	public Monitor(String model, int inch, int price) {
		this.model= model;
		this.inch = inch;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.model, this.inch, this.price);
	}
}

public class MonitorExample {

	public static void main(String[] args) {
		Monitor m1 = new Monitor("UDEA", 19, 210000);
		Monitor m2 = new Monitor("FLATRON", 22, 250000);
		Monitor m3 = new Monitor("UDEA", 19, 210000);
		Monitor m4 = new Monitor("SAMSUNG", 25, 310000);
	
		if(m1.hashCode() !=m2.hashCode()){
			System.out.println( "m1�� m2�� �ٸ� ������Դϴ�.");
		}
		if(m1.hashCode() ==m3.hashCode()){
			System.out.println("m1�� m3�� ���� ������Դϴ�.");
		}
		if(m1.hashCode() !=m2.hashCode()){
			System.out.println( "m1�� m4�� �ٸ� ������Դϴ�.");
		}
		
			
		
	}

}
