package sec;

import java.util.Scanner;

public class first_array_problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열수 입력:");
		int count=sc.nextInt();
		int[] num  = new int[count];
		for(int i=0; i<count;i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
	}

}
