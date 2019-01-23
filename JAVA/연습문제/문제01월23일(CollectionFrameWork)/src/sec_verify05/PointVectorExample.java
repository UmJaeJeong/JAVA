package sec_verify05;

import java.util.Vector;

public class PointVectorExample {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<>();
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(Point p : v) {
			System.out.println(p.toString());
		}

	}

}
