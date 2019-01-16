package sec04_exam_generic_method_2;

public class CompareMethodExample {

	public static void main(String[] args) {
		// p1�� KŸ���� Integer, VŸ���� String���� �������
		// (K�� V�� ����ڰ� ���ϴ´�� ���� ���ִ�.
		Pair<Integer, String> p1 = new Pair<>(1, "���");
		Pair<Integer, String> p2 = new Pair<>(1, "���");
		// Pair<Apple,String> p1 = new Pair<>(new Apple(10),'���);
		// Pair<Apple,String> p2 = new Pair<>(new Apple(10),'���);
		Pair<Integer, String> p3 = new Pair<Integer, String>(4, "���");

		// boolean result1 = Util.<Integer,String>compare(p1,p2) //jdk 1.6����\
		boolean result = Util.compare(p1, p2);

		if (result)
			System.out.println("�������� ������ ��ü�Դϴ�.");
		else
			System.out.println("�������� ������������ ��ü�Դϴ�.");

		result = Util.compare(p1, p3);

		if (result)
			System.out.println("�������� ������ ��ü�Դϴ�.");
		else
			System.out.println("�������� ������������ ��ü�Դϴ�.");

		Pair<String, String> p4 = new Pair<String, String>("�����1", "���ü�");
		Pair<String, String> p5 = new Pair<String, String>("�����1", "���ü�");

		result = Util.compare(p4, p5);

		if (result)
			System.out.println("�������� ������ ��ü�Դϴ�.");
		else
			System.out.println("�������� ������������ ��ü�Դϴ�.");

	}

}
