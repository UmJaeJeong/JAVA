package sec_verify05;

public class CarExample {

	public static void main(String[] args) {
		Sedan se = new Sedan();
		Truck tr = new Truck();
		se.setColor("³ë¶û»ö");
		se.setSpeed(300);
		se.seatNum = 5;
		se.downSpeed(100);
		se.upSpeed(100);

		
		tr.setColor("ÆÄ¶û");
		tr.setSpeed(200);
		tr.capacity = 50;
		
		System.out.println(se.toString());
		System.out.println(tr.toString());

	}

}
