package sec_verify06;

public class SamsungExample {

	public static void main(String[] args) {
		SamsungCar car = new SamsungCar();
		car.setColor("���");
		car.setCompany("����");
		car.setModel("����");
		car.setMaxSpeed(240);
		
		System.out.printf(car.toString());
		
	}

}
