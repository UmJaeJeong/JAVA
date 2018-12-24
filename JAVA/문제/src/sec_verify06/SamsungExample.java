package sec_verify06;

public class SamsungExample {

	public static void main(String[] args) {
		SamsungCar car = new SamsungCar();
		car.setColor("흰색");
		car.setCompany("현대");
		car.setModel("현대");
		car.setMaxSpeed(240);
		
		System.out.printf(car.toString());
		
	}

}
