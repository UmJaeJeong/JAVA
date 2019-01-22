package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable{
	@Override
	public Object call() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하신 사이의 정수의 합을 구합니다");
		System.out.print("첫 번째 정수 : ");
		int x=sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int y = sc.nextInt();
		int sum =0;
		for(int i=x;i<=y;i++)sum+=i;
		sc.close();
		return (Object)sum;
	}
}
