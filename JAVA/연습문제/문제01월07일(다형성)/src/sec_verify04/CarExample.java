package sec_verify04;

public class CarExample {

	public static void main(String[] args) {
		Car car  = new Car();
		car.tire[0] = new Tire("�տ��� Tire",6);
		car.tire[1] = new Tire("�տ����� Tire",2);
		car.tire[2] = new Tire("�ڿ��� Tire",3);
		car.tire[3] = new Tire("�ڿ����� Tire",4);
		
		for(int i=0; i<5; i++) {
			car.tire[0].accumulatedRotation--;
			car.tire[1].accumulatedRotation--;
			car.tire[2].accumulatedRotation--;
			car.tire[3].accumulatedRotation--;

			if(car.tire[0].roll())
			System.out.println(car.tire[0].location+"����: "+car.tire[0].accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.tire[0].location+" ��ũ***");
				car.tire[0] = new KumhoTrie("�տ��� KumhoTrie",12);
				System.out.println(car.tire[0].location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[1].roll())
			System.out.println(car.tire[1].location+"����: "+car.tire[1].accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.tire[1].location+" ��ũ***");
				car.tire[1] = new KumhoTrie("�տ��� KumhoTrie",12);
				System.out.println(car.tire[1].location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[2].roll())
			System.out.println(car.tire[2].location+"����: "+car.tire[2].accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.tire[2].location+" ��ũ***");
				car.tire[2] = new HankookTire("�ڿ��� HankookTire",13);
				System.out.println(car.tire[2].location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			if(car.tire[3].roll())
			System.out.println(car.tire[3].location+"����: "+car.tire[3].accumulatedRotation+"ȸ");
			else {
				car.stop();
				System.out.println("***"+car.tire[3].location+" ��ũ***");
				car.tire[3] = new HankookTire("�ڿ��� HankookTire",13);
				System.out.println(car.tire[3].location+"�� ��ü");
				System.out.println("---------------------------------------------------------");
				continue;
			}
			System.out.println("---------------------------------------------------------");

		}
	}

}
