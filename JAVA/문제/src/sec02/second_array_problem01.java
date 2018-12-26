package sec02;

import java.util.Scanner;

public class second_array_problem01 {

	public static void main(String[] args) {
		int[][] a = new int[10][7];
		int[] c = new int[7];
		
		for(int i=0; i<7;i++) {
			c[i] = (int)(Math.random()*10);//1~9

		}

		for(int i=0; i<10;i++) {
			for(int j=0;j<7;j++) {
				if(c[j]>=0 && i>=(10-c[j])) {
					System.out.print("*   ");

				}else {
					System.out.print("    ");

				}
			}
			
			System.out.println();
		}
		System.out.println("_   _   _   _   _   _   _");
		System.out.println("1   2   3   4   5   6   7");


	}

}
