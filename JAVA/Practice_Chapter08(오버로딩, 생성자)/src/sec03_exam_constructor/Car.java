package sec03_exam_constructor;

public class Car {
	String color;
	String gearType;
	int door;
	
	//������
	//�ƹ��� �����ڰ� ����Ǿ� ���� �ʴٸ�, �����Ϸ��� �˾Ƽ� �⺻�����ڸ�
	//�߰����شٴ� ���� �������
	
	public Car() {
		System.out.println("�⺻������ ȣ��");
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
