package sec1_verify02;

public class Calculator {
	boolean power;
	
	void powerOn() {
		power = true;
		System.out.println("���� ������ �մϴ�.");

	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double divide(int x, int y) {
		return (float)x/y;
	}
	
	void powerOff() {
		power = false;
		System.out.println("���� ������ ���ϴ�.");

	}
	
	
}
