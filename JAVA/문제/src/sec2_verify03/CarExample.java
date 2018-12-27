package sec2_verify03;

public class CarExample {

	public static void main(String[] args) {
		Car[] car = new Car[4];
		car[0] = new Car();
		car[1] = new Car("자가용");
		car[2] = new Car("자가용","빨강");
		car[3] = new Car("택시","검정",200);

	}

}
