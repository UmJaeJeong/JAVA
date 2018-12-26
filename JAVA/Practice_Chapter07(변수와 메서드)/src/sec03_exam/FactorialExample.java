package sec03_exam;

public class FactorialExample {

	public static void main(String[] args) {
		long result = FactorialExample.factorial(5L);
		System.out.println("5!(���丮��)�� : "+result);
	}
	
	//�ڱ� �ڽ��� ȣ���ϴ� ���
	//for������ �ص� �ǳ�, �ڵ带 ���°Ͱ� �ڵ��ߺ��� ���������ν� ����.
	public static long factorial(long n) {
		long result = 0L;
		//��μ� 1�϶�, ���ȣ���� �� �̻� ���̷������. f(1) = 1�̴ϱ�
		if(n==0) {
			result = 1;
		}else {
			result = n*factorial(n-1);//�޼��� �ڽ��� ȣ���Ѵ�.
		}
		
		return result;
	}

}
