package sec03_exam_PointExample;

public class Point3D extends Point{
	int z = 20;
	
	public Point3D() {
		this(100,200,300);
	}
	
	//Point(int x, int y)를 호출한다.
	public Point3D(int x, int y, int z) {
		super(x,y);	//조상클래스 생성자 호출
		this.z = z; //자신의 멤버변수 초기화
	}

}
