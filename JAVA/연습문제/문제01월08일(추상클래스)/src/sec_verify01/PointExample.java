package sec_verify01;

public class PointExample {

	public static void main(String[] args) {
		MyColorPoint cp = new MyColorPoint(2,3,"blue");
		cp.show();
		cp.move(3, 4);
		cp.reverse();
		cp.show();
		
	}

}
