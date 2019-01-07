package sec_verify04;

public class Circle {
	int radius;
	String name;
	
	double getArea() {
		return (this.radius*this.radius)*3.14;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"의 면적은 "+getArea();
	}
	
}
