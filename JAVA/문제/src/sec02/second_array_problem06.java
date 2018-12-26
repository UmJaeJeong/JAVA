package sec02;

import java.util.Scanner;

public class second_array_problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arry = new int[][]{ 
			{95, 86, 100, 55},
			{83, 92, 96},
			{78, 83, 93, 87, 88, 77, 10}
		};			
		
		int sum = 0;
		int count = 0;
		for(int[] ar : arry) {
			for(int i : ar) {
				sum+=i;
				count++;
			}
		}
		
		System.out.println("가변배열의 합 : "+sum);
		System.out.printf("가변배열의 평균 : %.1f",sum/(float)count);

	}

}
