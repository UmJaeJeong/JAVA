package sec_verify03;

public class ColorPointExample {

	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint();
		p1.set(3, 4);
		p1.setColor("����");
		p1.showColorPoint();
		ColorPoint p2 = new ColorPoint();
		p2.set(10, 50);
		p2.setColor("���");
		p2.showColorPoint();
		ColorPoint p3 = new ColorPoint();
		p3.set(20, 17);
		p3.setColor("���");
		p3.showColorPoint();
		ColorPoint p4 = new ColorPoint();
		p4.set(2, 1);
		p4.setColor("�׸�");
		p4.showColorPoint();
	}

}
