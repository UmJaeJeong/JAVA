package sec1_verify05;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		System.out.println("제곱까지의 합을 계산합니다.");
		System.out.print("제곱하고 싶은 수를 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		System.out.print("몇승을 더할까요? : ");
		int y = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=y;i++) {
			sum+=pow(x,i);
		}
		System.out.printf("%d의 %d승 까지의 합은 %d입니당!",x,y,sum);
	}
	public static long pow(int x, int n) {
		long result = 0L;
		//비로소 1일때, 재귀호출이 더 이상 안이루어진다. f(1) = 1이니깐
		if(n==0) {
			result = 1;
		}else {
			result = x*pow(x,n-1);
		}
		return result;
	}

}
