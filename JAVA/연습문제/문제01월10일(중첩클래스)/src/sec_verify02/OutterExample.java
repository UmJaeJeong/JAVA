package sec_verify02;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner inner = new Outter.Inner();
		System.out.println("�ܺ�Ŭ������ �������� �ʰ�, �������Ŭ����(Inner)�� ���� ��� CV�� : "+Outter.Inner.cv);
		System.out.println("�ܺ�Ŭ������ �����ϰ�, �������Ŭ����(Inner)�� �ν��Ͻ� ��� IV�� : "+ inner.iv);
	}

}
