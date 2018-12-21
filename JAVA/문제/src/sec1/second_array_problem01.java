package sec1;

import java.util.Scanner;

public class second_array_problem01 {

	public static void main(String[] args) {
		int[][] num = new int[10][7];
		int[][] a = new int[7][10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<7;i++) {
			int x = (int)(Math.random()*10);
			for(int j=0; j<x;j++) {
				a[i][j] = 1;
			}
		}
		
		for(int i=0; i<7;i++) {
			for(int j=9;j>=0;j--) {
				if(a[i][j]==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
