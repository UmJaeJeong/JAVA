package sec_verify08;

public class MathRoundExample {

	public static void main(String[] args) {
		System.out.println("�ڹٿ��� �����ϴ� Math.round(3.17836)�� �� ��� : "+Math.round(3.17836));
		
		System.out.println();
		System.out.println("���� ���� round()�� ����� ���");
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,2));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,3));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,4));
		System.out.println("3.17836�� �ټ�° �ڸ����� �ݿø� �� ��� : "+round(3.17836,5));
	}
	
	static double round(double d, int n) {
		double ret = 0;
		double temp1 = d*Math.pow(10, n-1);
		double temp2 = Math.round(temp1);
		ret  = temp2/Math.pow(10, n-1);
		
		return ret;
	}

}
