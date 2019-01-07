package sec1_verify02;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.println("result1: "+cal.plus(6,5));
		System.out.println("result2: "+cal.divide(5, 2));
		cal.powerOff();
		


	}

}
