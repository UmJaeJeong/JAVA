package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {
		//�������̽��� �����ߴ¶�� ���� ����Ŭ������ ������ ������ �ǹ��Ѵ�.
		//�׷��� �������� ����ȴ�.
		A a = new Person();
		Person p  = new Person();
		
		a.method();
		//a.method2();//���ܹ߻�? ����? �ٺ��� A�̹Ƿ� �������̽����� method2��� �Լ��� ���� �Ǿ� ���� �ʴ�.
		p.method();
		
		A a1 = new Member();
		a1.method();
	}

}
