package sec05_exam_throws;

public class throwsExample01 {

	public static void main(String[] args) {
		try {
			method1();//���� Ŭ�������� static����̹Ƿ� ��ü �������� ���� ȣ�Ⱑ��.
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//main�޼����� ��
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception(); //���ܹ߻�����
		//method2�� ��
	}

}
