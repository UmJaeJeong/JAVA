package sec03_exam_RepairableExample;

public class RepairableExample {

	public static void main(String[] args) {
		SCV scv = new SCV();
		//Marine marine = new Marine();
		
		Tank tank = new Tank();
		tank.DamageUnit(tank, 100);
		scv.repair(tank);	//SCV가 Tank를 수리하도록 한다.
		
		System.out.println("-----------------------------------------------");
		
		DropShip dropship = new DropShip();
		dropship.DamageUnit(dropship, 88);
		scv.repair(dropship);
		System.out.println("-----------------------------------------------");
		
		//marine은 왜 예외가 날까?
		//scv.repair(marine)
	}

}
