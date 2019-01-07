package sec;

import java.util.Scanner;

public class first_array_problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int last=0;
		System.out.println("원하는 정수를 계속 입력하세요(-1을 입력하면 빠져나갑니다) :");
		for(int i=0; i<100;i++) {
			int x= sc.nextInt();
			if(x==-1) break;
			a[i] = x;
			last = i;		
		}
		System.out.print("마지막 3개의 값은 ");

		for(int i=last-3;i<=last;i++) {
			System.out.print(a[i]);
		}
		System.out.print("이네요...");

	}

}
