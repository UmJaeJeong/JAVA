package sec_verify06;

import java.util.Scanner;

public class GoodCalcExample {

	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		System.out.println("두 정수(2, 3)의 합 :"+gc.add(2, 3));
		System.out.println("두 정수(2, -13)의 합 :"+gc.subtract(2, -13));
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 방을 만들까요?");
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println((i+1)+"번째 값 : ");
			arr[i] = sc.nextInt();
		}
			
		
		System.out.print("배열(");
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]+") :"+gc.average(arr));

			}
		}
		
		

	}

}
