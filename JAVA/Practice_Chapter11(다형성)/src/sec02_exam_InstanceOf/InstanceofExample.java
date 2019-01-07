package sec02_exam_InstanceOf;
//�θ�Ŭ����
class Parent{}
//�ڽ�Ŭ����
class Child extends Parent{}

public class InstanceofExample {

	//�ָ��Ұ��� �Ű������� ����Ÿ���̶�� �Ϳ� ��������.
	public static void method1(Parent parent) {
		//���� ��� ���迡 �־ instanceof�������� ����� true�̹Ƿ� ����ĳ������ ����
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		}
		else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
			
	}
	
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			parent = new Child();
			//Child child =(Child)parent;
			System.out.println("method2 - Child�� ��ȯ ����");

		}else {
			System.out.println("method2 - Child�� ��ȯ ����");

		}
	}
	
	public static void main(String[] args) {
		//parentA�� ���� �������� ������ �� �ڵ��̰�, parentB�� �������� ������� �ڵ�
		Parent parentA = new Child();
		method1(new Child());
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//�������� ����Ǹ鼭 �޼��� ȣ���� �Ǿ� ��ȯ�� �����ϴ�.
		method1(new Child());
		method2(parentB);
	}

}
