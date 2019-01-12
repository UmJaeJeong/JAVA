package sec03_exam_Multi_Catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			//���� ���ܰ� �߻��� �� �ֳ�?
			String data1 = args[0];
			String data2 = args[1];
			//�̰� �������ܰ� �߻��Ҽ� �ֳ�?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1+value2;
			
			System.out.println(data1+"+"+data2+"+"+result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("����Ű����� �����մϴ�.");
			System.out.println("������ java CatchByExceptionKindExample num1 num2");
			System.out.println("���α׷��� ���������մϴ�.");
			
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϴ�. �Ű������� ���� Ȯ���ϼ���!");
			System.out.println("���α׷��� ���������մϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���!");
		}
	}

}
