package sec1;

import java.util.Scanner;

public class second_array_problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[6][2];		
		int[] totalsum =new int[2];
		float[] totalaverage =new float[2];
		int[] sum = new int[6];

		//������
		for(int i=0; i<6;i++) {
				System.out.print((i+1)+"��° �������� �Է� :");
				score[i][0] = sc.nextInt();
				
				System.out.print((i+1)+"��° �������� �Է� :");
				score[i][1] = sc.nextInt();
				
				totalsum[0]+=score[i][0];
				totalsum[1]+=score[i][1];
				sum[i]+=score[i][0]+score[i][1];
				
		}
		System.out.println(totalsum[0]+"  "+totalsum[1]);
		
		System.out.println("===============================================");
		System.out.printf("���� ��� : %.2f %n",totalsum[0]/6.0f);
		System.out.printf("���� ��� : %.2f%n",totalsum[1]/6.0f);
		System.out.println("===============================================");
		
		for(int i=0; i<6;i++) {
			System.out.printf("%d��° �л��� ��� : %.1f%n",i+1,sum[i]/2.0f);
		}
	}

}
