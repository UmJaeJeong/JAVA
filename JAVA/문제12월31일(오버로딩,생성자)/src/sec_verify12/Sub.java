package sec_verify12;

public class Sub {
	private int firstNum;
	private int secondNum;
	
	void setValue(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	int calculate() {
		return this.firstNum-this.secondNum ;
	}
}
