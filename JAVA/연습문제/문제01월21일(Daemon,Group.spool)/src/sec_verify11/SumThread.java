package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable{
	@Override
	public Object call() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ������ ������ ���� ���մϴ�");
		System.out.print("ù ��° ���� : ");
		int x=sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int y = sc.nextInt();
		int sum =0;
		for(int i=x;i<=y;i++)sum+=i;
		sc.close();
		return (Object)sum;
	}
}
