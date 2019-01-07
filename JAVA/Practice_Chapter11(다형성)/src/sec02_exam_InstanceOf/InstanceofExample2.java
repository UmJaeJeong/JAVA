package sec02_exam_InstanceOf;
//�θ�Ŭ����
class Car{}
//�ڽ�Ŭ����
class FireEngine extends Car{}

public class InstanceofExample2 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		//Car car = new Car();
		
		//instanceof�������� ����� ���̸� ����ȯ�� �����ϴٶ�� �Ϳ� �ָ�!
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		//��������.getClass()�� ���������� �ν��Ͻ��� �����Ͷ�� �޼����̸�,
		//getName()�� �ش�Ŭ������ ��Ű���� Ŭ�������� ����ϴ� ���̴�.
		//����, getSimpleName()�� ��Ű������ �����ϰ�, �ܼ� Ŭ������ ����ϴ� �޼����̴�.
		System.out.println(fe.getClass().getName());
		System.out.println(fe.getClass().getSimpleName());

	}

}
