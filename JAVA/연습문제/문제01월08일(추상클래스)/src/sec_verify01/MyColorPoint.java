package sec_verify01;

public class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected void reverse() {
		System.out.println("x와 y의 값을 바꿨습니다.");
		int tmp;
		tmp = this.x;
		this.x = this.y;
		this.y =tmp;
	}

	protected void show() {
		super.show();
		System.out.println(this.color);
	}
	
}
