package sec04_exam_throw;

public class ThrowExample01 {

	public static void main(String[] args) {
		try {
			throw new Exception("���Ƿ� �߻���Ŵ");
		}	
		//ExceptionŬ������ ��� ������ �����̹Ƿ� � ���ܵ� �� ������ �ִ�.
		catch(Exception e) {
			System.out.println("�����޼��� : "+e.getMessage());
			//���� �޸𸮿� �ִ� ������� ���(���߿�)
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
	
/*	public static void method() throws Exception{
		throw new Exception("���Ƿ� �߻���Ŵ");
	}*/

}
