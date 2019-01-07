package sec02;

import java.util.Scanner;

public class second_array_problem02 {

	public static void main(String[] args) {
		int[][] score = new int[][] {
			  {100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
						};
			int[] Sum = new int[4];
			
			for(int i=0; i<score.length;i++) {
				int sum = 0;
				for(int j=0 ; j<score[i].length;j++) {
					sum +=score[i][j];
					Sum[j] += score[i][j];
					System.out.printf("%4d",score[i][j]);
				}
				Sum[3]+=sum;
				System.out.printf("%4d%n",sum);
			}
			
			for(int i=0; i<4;i++) {
				System.out.printf("%4d",Sum[i]);
			}
			//1,1 
	}

}