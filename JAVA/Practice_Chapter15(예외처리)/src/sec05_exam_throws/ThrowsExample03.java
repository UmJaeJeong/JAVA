package sec05_exam_throws;

public class ThrowsExample03 {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}
	}
	
	//ClassNotFoundException���ܸ� ȣ���Ѱ����� ���ѱ��
	public static void findClass() throws ClassNotFoundException{
		//ClassNotFoundException�� �߻������� �Ϲ� �����̴�.
		Class clazz = Class.forName("java.lang.String2");
	}

}
