package sec02_exam_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		//ClassŬ�����¹��ڿ��� ������ Ŭ������ ���� ��ȯ���ش�.
		//(�ν��Ͻ��� ����� �� ���, ��ȯ�� �ν��Ͻ��� ������ �� ���̴�.)
		//������, ���ڿ��� �ش��ϴ� Ŭ������ ���ٸ� �Ϲ� ���ܰ� �߻��Ѵ�.
		//�׷��� �������� ���� �ʴ´�. �� �ٽø��� ����ó���� �ʼ����̴�.
		try {
			//Class clazz = Class.forName("java.lang.String2");
			Class clazz = Class.forName("java.lang.String");
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}
		//���ܴ� �߻������� �������� ���� �˼��� �ִ�.
		catch(Exception e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		//�׻� �����Ѵ�.
		finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
		
		
	}
}
