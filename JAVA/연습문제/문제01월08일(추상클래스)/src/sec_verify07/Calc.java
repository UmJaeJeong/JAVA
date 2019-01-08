package sec_verify07;

public abstract class Calc {
	double a;
	double b;
	
	void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract double calculate();
}
