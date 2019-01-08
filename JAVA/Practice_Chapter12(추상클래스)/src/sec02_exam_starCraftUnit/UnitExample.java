package sec02_exam_starCraftUnit;

public class UnitExample {

	public static void main(String[] args) {
		//Unit unit = new Unit();//에러난다 그 이유는? 추상클래스이므로 객체를 생성할 수 없다.
		System.out.println("----------------------------------");
		Tank tank = new Tank();
		tank.move(100, 100);
		tank.sizeMode();
		tank.stop("탱크", 300, 400);
		
		System.out.println("----------------------------------");
		Marine marine = new Marine();
		marine.move(200, 500);
		marine.stimPack();
		marine.stop("마린", 300, 400);
		
		System.out.println("----------------------------------");
		DropShip dp = new DropShip();
		dp.move(500, 600);
		dp.load();
		dp.unLoad();
		dp.stop("드랍쉽", 200, 100);
		System.out.println("----------------------------------");

	}

}
