package sec1_verify05;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		System.out.println("���������� ���� ����մϴ�.");
		System.out.print("�����ϰ� ���� ���� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		System.out.print("����� ���ұ��? : ");
		int y = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=y;i++) {
			sum+=pow(x,i);
		}
		System.out.printf("%d�� %d�� ������ ���� %d�Դϴ�!",x,y,sum);
	}
	public static long pow(int x, int n) {
		long result = 0L;
		//��μ� 1�϶�, ���ȣ���� �� �̻� ���̷������. f(1) = 1�̴ϱ�
		if(n==0) {
			result = 1;
		}else {
			result = x*pow(x,n-1);
		}
		return result;
	}

}
