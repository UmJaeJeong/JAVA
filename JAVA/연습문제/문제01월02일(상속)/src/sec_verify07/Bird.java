package sec_verify07;

public class Bird {
	String type;
	boolean flightYN;
	
	public boolean getFlight() {
		return this.flightYN;
	}
	
	public void move() {
		System.out.println("새가 날아가네요");
	}
}
