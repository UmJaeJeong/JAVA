package sec_verify05;

public abstract class Shape {
	Point p;
	
	public Shape() {
		this(new Point());
	}
	 
	public Shape(Point p)
	{
		this.p = p;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	public abstract double calcArea();
	
	
	
}
