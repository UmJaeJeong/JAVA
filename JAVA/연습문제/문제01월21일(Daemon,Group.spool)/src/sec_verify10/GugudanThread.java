package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("[������ �۾���û]\r\n" + 
				"���ϴ� ������ ���� �Է��ϼ��� : ");
		int k= sc.nextInt();
		for(int i=1;i<10;i++) System.out.println(k+" * "+i+" = "+k*i);
		System.out.println("[������ �۾� �Ϸ�]");
		sc.close();
	}
}
