package sec01;

import java.util.Scanner;

public class first_array_problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		for(int i=0; i<num;i++) {
			System.out.println(arr[i]);
		}
	}

}
