package sec03_exam_PointExample;

public class Point3D extends Point{
	int z = 20;
	
	public Point3D() {
		this(100,200,300);
	}
	
	//Point(int x, int y)�� ȣ���Ѵ�.
	public Point3D(int x, int y, int z) {
		super(x,y);	//����Ŭ���� ������ ȣ��
		this.z = z; //�ڽ��� ������� �ʱ�ȭ
	}

}
