package sec1;

import java.util.Scanner;

public class second_array_problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반수 : ");

		int x =sc.nextInt();
		int[][] Class = new int[x][50];
		int[] Sum = new int[x];
		float[] average =new float[x];
		
		for(int i=0; i<x;i++) {
			System.out.print((i+1)+"반의 인원 : ");
			int y = sc.nextInt();
			for(int j=0; j<y;j++) {
				System.out.print((i+1)+"반 "+(i+1)+"번의 점수 :");
				Class[i][j] = sc.nextInt();
				Sum[i]+=Class[i][j];
				average[i]+=Class[i][j]/(float)y;
			}
		}
			
		
		System.out.println("반\t합계\t평균");
		System.out.println("---------------------");
		for(int i=0;i<x;i++) {
			System.out.printf("%d반\t%3d\t%.1f%n",i+1,Sum[i],average[i]);
		}
		System.out.println("---------------------");
		System.out.printf("계 \t%3d\t%.1f%n",Sum[0]+Sum[1],(average[0]+average[1])/(float)x);



	}

}
