package sec02_exam_starCraftUnit;

public class UnitExample {

	public static void main(String[] args) {
		//Unit unit = new Unit();//�������� �� ������? �߻�Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
		System.out.println("----------------------------------");
		Tank tank = new Tank();
		tank.move(100, 100);
		tank.sizeMode();
		tank.stop("��ũ", 300, 400);
		
		System.out.println("----------------------------------");
		Marine marine = new Marine();
		marine.move(200, 500);
		marine.stimPack();
		marine.stop("����", 300, 400);
		
		System.out.println("----------------------------------");
		DropShip dp = new DropShip();
		dp.move(500, 600);
		dp.load();
		dp.unLoad();
		dp.stop("�����", 200, 100);
		System.out.println("----------------------------------");

	}

}
