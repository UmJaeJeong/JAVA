package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface1 {
	//default�޼���� �⺻������ public ���������� ���´�.
	public default void method3() {
		System.out.println("�������̽� 2�� ����� ����Ʈ �޼���3 ȣ��");
	}
	
	public default void method4() {
		System.out.println("�������̽� 2�� ����� ����Ʈ �޼���4 ȣ��");
	}
	
	public static void staticMethod() {
		System.out.println("�������̽� 2�� ����� ����(static)�޼��� ȣ��");
	}
}
