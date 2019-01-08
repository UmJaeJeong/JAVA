package sec_verify04;

public class Computer extends Calculator{
	
	public Computer() {
		
	}
	
	@Override
	public double areaCircle(double r) {
		double area=0;
		area = r*r*Math.PI;
		return area;
	}
}
