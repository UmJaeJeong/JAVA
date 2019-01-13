package sec_verify03;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(this.x == p.x && this.y == p.y) {
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "x : "+this.x+"이며, y :"+this.y+"이다";
	}
}
