package sec;

import java.util.Scanner;

public class first_array_problem4 {

	public static void main(String[] args) {
		int[] score = new int[] {79,88,91,33,100,55,95};
		int max=0;
		int min=0;
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length-1;j++) {
				if(score[j]>score[j+1]) {
					int temp = score[j];
					score[j]=score[j+1];
					score[j+1] = temp;
				}
			}
		}
		min = score[0];
		max = score[score.length-1];
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);

	}

}
