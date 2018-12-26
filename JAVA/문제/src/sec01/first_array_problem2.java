package sec01;

import java.util.Scanner;

public class first_array_problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<num;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.print("arr = [");
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1)
			System.out.print(arr[i]+" ,");
			else
				System.out.print(arr[i]);

		}
		System.out.print("]");

	}

}
