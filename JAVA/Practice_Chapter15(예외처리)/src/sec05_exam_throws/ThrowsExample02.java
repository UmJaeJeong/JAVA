package sec05_exam_throws;

public class ThrowsExample02 {

	public static void main(String[] args) {
		method1(); //���� Ŭ�������� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��.
		//main�޼��� ��
	}
	
	public static void method1() {
		try {
			throw new Exception();	//���� �߻� ��Ű��, method1���� ����ó���� �ߴ�.
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}

}
