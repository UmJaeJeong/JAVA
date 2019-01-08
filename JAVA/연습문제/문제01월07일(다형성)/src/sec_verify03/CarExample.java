package sec_verify03;

public class CarExample {

	public static void main(String[] args) {
		Car car  = new Car();
		car.frontLeftTire = new Tire("�տ��� Tire",6);
		car.frontRightTire = new Tire("�տ����� Tire",2);
		car.backLeftTire = new Tire("�ڿ��� Tire",3);
		car.backRightTire = new Tire("�ڿ����� Tire",4);
		
		for(int i=0; i<5; i++) {
			car.frontLeftTire.accumulatedRotation--;
			car.frontRightTire.accumulatedRotation--;
			car.backLeftTire.accumulatedRotation--;
			car.backRightTire.accumulatedRotation--;

			if(car.frontLeftTire.roll())
			System.out.println(car.frontLeftTire.location+"����: "+car.frontLeftTire.accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.frontLeftTire.location+" ��ũ***");
				car.frontLeftTire = new KumhoTrie("�տ��� KumhoTrie",12);
				System.out.println(car.frontLeftTire.location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.frontRightTire.roll())
			System.out.println(car.frontRightTire.location+"����: "+car.frontRightTire.accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.frontRightTire.location+" ��ũ***");
				car.frontRightTire = new KumhoTrie("�տ��� KumhoTrie",12);
				System.out.println(car.frontRightTire.location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.backLeftTire.roll())
			System.out.println(car.backLeftTire.location+"����: "+car.backLeftTire.accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.backLeftTire.location+" ��ũ***");
				car.backLeftTire = new HankookTire("�ڿ��� HankookTire",13);
				System.out.println(car.backLeftTire.location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.backRightTire.roll())
			System.out.println(car.backRightTire.location+"����: "+car.backRightTire.accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.backRightTire.location+" ��ũ***");
				car.backRightTire = new HankookTire("�ڿ��� HankookTire",13);
				System.out.println(car.backRightTire.location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			System.out.println("---------------------------------------------------------");

		}
	}

}
