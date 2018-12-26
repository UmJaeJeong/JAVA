package sec01;

import java.util.Scanner;

public class first_array_problem14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] day = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("달을 입력하세요 :");

		int x = sc.nextInt();
		if(x>=1&& x<=12)
		System.out.println(x+"월의 일수는 : "+day[x-1]+"입니다.");
		else System.out.println("잘못 입력했습니다.");

	}

}
