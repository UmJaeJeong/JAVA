package sec01_exam;

public class MyMath {
	//2�� �ν��Ͻ� ����޼���, 2����static�޼���
	//return���� �׻� 1���� �� �ּ�ȭ �����ִ°� �ٶ����ϴ�.
	public long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b;//���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	
	public long subtract(long a, long b) {
		return a-b;
	}
	
	public static long multiply(long a, long b) {
		return a*b;
	}
	
	public static double divide(double a, double b) {
		return a/b;
	}
	
	public String studyJava() {
		return "�ڹ� ������ �մϴ�.";
	}

}
