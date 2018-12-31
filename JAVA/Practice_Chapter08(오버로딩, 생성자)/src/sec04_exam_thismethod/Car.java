package sec04_exam_thismethod;


public class Car {
	String color;
	String gearType;
	int door;
	
	//������
	//�ƹ��� �����ڰ� ����Ǿ� ���� �ʴٸ�, �����Ϸ��� �˾Ƽ� �⺻�����ڸ�
	//�߰����شٴ� ���� �������
	
	public Car() {
		this("white","auto",4);
		System.out.println("�⺻������ ȣ��");
	}
	
	public Car(String color) {
		this(color,"auto",4);
		System.out.println("�Ű������� �ִ� ������ ȣ��");

	}
	
	public Car(String color, String gearType) {
		this(color,gearType,4);
		System.out.println("�Ű������� �ִ� ������ ȣ��");
	}
	
	//�Ű������� �ִ� ������
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�Ű������� �ִ� ������ ȣ��");
	}
	//�̳����̼�(annotation) : �����Ϸ����� ���ϰ� üũ���϶�� ��.
	
	@Override
	public String toString() {
		String str= "���� ="+this.color+" ���Ÿ��="+this.gearType+" ������="+this.door;
		return str;
	}
}
