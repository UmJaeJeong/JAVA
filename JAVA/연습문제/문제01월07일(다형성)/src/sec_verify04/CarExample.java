package sec_verify04;

public class CarExample {

	public static void main(String[] args) {
		Car car  = new Car();
		car.tire[0] = new Tire("앞왼쪽 Tire",6);
		car.tire[1] = new Tire("앞오른쪽 Tire",2);
		car.tire[2] = new Tire("뒤왼쪽 Tire",3);
		car.tire[3] = new Tire("뒤오른쪽 Tire",4);
		
		for(int i=0; i<5; i++) {
			car.tire[0].accumulatedRotation--;
			car.tire[1].accumulatedRotation--;
			car.tire[2].accumulatedRotation--;
			car.tire[3].accumulatedRotation--;

			if(car.tire[0].roll())
			System.out.println(car.tire[0].location+"수명: "+car.tire[0].accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.tire[0].location+" 펑크***");
				car.tire[0] = new KumhoTrie("앞왼쪽 KumhoTrie",12);
				System.out.println(car.tire[0].location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[1].roll())
			System.out.println(car.tire[1].location+"수명: "+car.tire[1].accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.tire[1].location+" 펑크***");
				car.tire[1] = new KumhoTrie("앞오쪽 KumhoTrie",12);
				System.out.println(car.tire[1].location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[2].roll())
			System.out.println(car.tire[2].location+"수명: "+car.tire[2].accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.tire[2].location+" 펑크***");
				car.tire[2] = new HankookTire("뒤왼쪽 HankookTire",13);
				System.out.println(car.tire[2].location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[3].roll())
			System.out.println(car.tire[3].location+"수명: "+car.tire[3].accumulatedRotation+"회");
			else {
				car.stop();
				System.out.println("***"+car.tire[3].location+" 펑크***");
				car.tire[3] = new HankookTire("뒤오쪽 HankookTire",13);
				System.out.println(car.tire[3].location+"로 교체");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			System.out.println("---------------------------------------------------------");

		}
	}

}
