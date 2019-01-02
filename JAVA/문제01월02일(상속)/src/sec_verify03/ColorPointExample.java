package sec_verify03;

public class ColorPointExample {

	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint();
		p1.set(3, 4);
		p1.setColor("레드");
		p1.showColorPoint();
		ColorPoint p2 = new ColorPoint();
		p2.set(10, 50);
		p2.setColor("블루");
		p2.showColorPoint();
		ColorPoint p3 = new ColorPoint();
		p3.set(20, 17);
		p3.setColor("노랑");
		p3.showColorPoint();
		ColorPoint p4 = new ColorPoint();
		p4.set(2, 1);
		p4.setColor("그린");
		p4.showColorPoint();
	}

}
