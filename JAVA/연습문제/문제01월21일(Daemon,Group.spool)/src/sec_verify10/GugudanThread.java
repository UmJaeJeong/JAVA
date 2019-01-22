package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("[구구단 작업요청]\r\n" + 
				"원하는 구구단 수를 입력하세요 : ");
		int k= sc.nextInt();
		for(int i=1;i<10;i++) System.out.println(k+" * "+i+" = "+k*i);
		System.out.println("[구구단 작업 완료]");
		sc.close();
	}
}
