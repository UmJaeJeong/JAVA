package sec02_exam_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//Box<T>���� T�� String�̴�. ��,BoxŬ������ ���׸� Ÿ������ ������
		//StringŬ������ ���ڴٴ� ���� �����Ϸ����� ��������� �˸��� ���̴�.
		//Ÿ�Ժ�ȯ ����, �������� ����ȭ(�������� ���)
		
		Box<String> box1 = new Box<String>();
		box1.setT("ȫ�浿");
		String name= box1.getT();
		System.out.println(name);
		
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(100);//�ڵ��ڽ�
		int value = box2.getT();//�ڵ� ��ڽ�
		System.out.println(value);
		
		Box<Apple> box3 = new Box<Apple>();
		box3.setT(new Apple());
		Apple apple = box3.getT();
		System.out.println(apple);
	}

}
