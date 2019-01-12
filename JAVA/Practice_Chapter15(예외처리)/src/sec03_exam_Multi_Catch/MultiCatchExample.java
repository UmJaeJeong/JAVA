package sec03_exam_Multi_Catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			//�������ܰ� �߻��� ���� �ִ�?
			String data1 = args[0];
			String data2 = args[1];
			//���� �������ܰ� �߻��Ҽ� �ֳ�?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1+value2;
			System.out.println(data1+"+"+data2+"+"+result);
		}
		//��Ƽ ĳġ(JDK 1.7���� ����)
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("����Ű����� �����ϰų� ���ڷ� ��ȯ�Ҽ� ����."+e.toString());
			System.out.println("���α׷��� ���������մϴ�.");
		}catch(Exception e) {
			System.out.println("�˼����� ���ܰ� �߻�");
			System.out.println("���α׷��� ���������ٴϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���!");
		}
	}

}
