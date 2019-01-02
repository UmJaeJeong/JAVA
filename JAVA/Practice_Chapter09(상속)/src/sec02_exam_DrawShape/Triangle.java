package sec02_exam_DrawShape;

//세개의 점을 가지고 있는 삼각형(has a 관계)
public class Triangle extends Shape{
	
	//점이 3개 가 있어야 비로소 삼각혀잉 완성되므로, Point를 배열로 선언했다.
	Point[] p = null;
	
	//생성자
	public Triangle(Point[] p) {
		super();
		this.p = p;
	}
	
	//오버라이딩
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.printf("[p1 = %s, p2 = %s, p3 %s, color(색깔)=%s]%n",this.p[0].getXY(), this.p[0].getXY(), this.p[0].getXY(),this.color);
	}
}
