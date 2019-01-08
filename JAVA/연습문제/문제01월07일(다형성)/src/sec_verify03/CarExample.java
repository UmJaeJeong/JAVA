package sec_verify03;

public class CarExample {

	public static void main(String[] args) {
		Car car  = new Car();
		car.frontLeftTire = new Tire("앞왼쪽 Tire",6);
		car.frontRightTire = new Tire("앞오른쪽 Tire",2);
		car.backLeftTire = new Tire("뒤왼쪽 Tire",3);
		car.backRightTire = new Tire("뒤오른쪽 Tire",4);
		
		for(int i=0; i<5; i++) {
			car.frontLeftTire.accumulatedRotation--;
			car.frontRightTire.accumulatedRotation--;
			car.backLeftTire.accumulatedRotation--;
			car.backRightTire.accumulatedRotation--;

			if(car.frontLeftTire.roll())
			System.out.println(car.frontLeftTire.location+"수명: "+car.frontLeftTire.accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.frontLeftTire.location+" 펑크***");
				car.frontLeftTire = new KumhoTrie("앞왼쪽 KumhoTrie",12);
				System.out.println(car.frontLeftTire.location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.frontRightTire.roll())
			System.out.println(car.frontRightTire.location+"수명: "+car.frontRightTire.accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.frontRightTire.location+" 펑크***");
				car.frontRightTire = new KumhoTrie("앞오쪽 KumhoTrie",12);
				System.out.println(car.frontRightTire.location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.backLeftTire.roll())
			System.out.println(car.backLeftTire.location+"수명: "+car.backLeftTire.accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.backLeftTire.location+" 펑크***");
				car.backLeftTire = new HankookTire("뒤왼쪽 HankookTire",13);
				System.out.println(car.backLeftTire.location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.backRightTire.roll())
			System.out.println(car.backRightTire.location+"수명: "+car.backRightTire.accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.backRightTire.location+" 펑크***");
				car.backRightTire = new HankookTire("뒤오쪽 HankookTire",13);
				System.out.println(car.backRightTire.location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			System.out.println("---------------------------------------------------------");

		}
	}

}
