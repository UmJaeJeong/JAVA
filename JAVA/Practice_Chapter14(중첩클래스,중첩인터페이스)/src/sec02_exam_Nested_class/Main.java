package sec02_exam_Nested_class;

public class Main {

	public static void main(String[] args) {
		A a = new A(); //�ܺ�(�ٱ�Ŭ����)Ŭ���� �ν��Ͻ� ����
		//AŬ������ ����������� ���� (��ø)Ŭ���� �ν��Ͻ� ����
		//(���� �ܺ�Ŭ������ �ν��Ͻ��� �����Ͽ��Ѵ�.)
		A.B b = a.new B();
		b.method1();//b�� ����޼����� method1ȣ��
		
		//����(static) ����� �ν��Ͻ� ����(�ܺ�Ŭ������ �ν��Ͻ� �������� �ٷ� ����)
		A.C c = new A.C();
		System.out.println(c.b);
		A.C.method3();
		
		//�ܺ�Ŭ������ ����޼����� method�� ȣ�������ν�
		//����Ŭ������ �ν��Ͻ��� ������/.
		a.method();
	}

}
