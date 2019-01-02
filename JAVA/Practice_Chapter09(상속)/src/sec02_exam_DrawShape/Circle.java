package sec02_exam_DrawShape;

public class Circle extends Shape{
	Point center = null;
	int r;
	
	//Circle(Point center, int r)�� ȣ��
	public Circle(){
		//this(PointŬ������ �ν��Ͻ� �ּҰ�, 100)�� ������ �����ڸ� ȣ��
		this(new Point(0,0),100);//this(int x, int y) --> �Ű����� 2�� int�� ������ ������ ȣ��
		//this(center, 100);
	}
	
	//center�� Point�� ��������(�ּҰ�), r=100
	public Circle(Point center, int r) {
		super();				//����Ŭ������ �����ڸ� ȣ����
		this.center = center;	//0,0
		this.r = r;				//100
	}
	
	
	//����Ŭ������ ����޼����� draw()�� �������̵�(������) ��
	//���� �׸��� ��ſ� ���� ������ ����ϵ��� �ߴ�.
	//(�������̵� : ����ΰ� ������ ����, �����θ� �ٸ��� ������)
	@Override
	public void draw() {
		System.out.printf("[center(����) = (%d, %d), r(������)=%d, color(����)=%s]%n",this.center.x, this.center.y, this.r, this.color);
	}
}
