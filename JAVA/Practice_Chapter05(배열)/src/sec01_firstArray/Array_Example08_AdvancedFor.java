package sec01_firstArray;

import java.util.Scanner;

public class Array_Example08_AdvancedFor {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		sc.nextInt();*/
		
		int[] scores = new int[] {95,71,84,93,87};
		int sum = 0;
		/*
		 for(int i=0; i<scores.length;i++){
		 sum+=scores[i];
		 */
		
		//���� for(�÷��������ӿ�ũ���� ���� ���)
		//������ Ÿ�� ������ : ������ ��� (��������)
		//���� ���� scores -> int score-> sum+=score
		for(int score : scores) {
			sum+=score;
		}
		
		System.out.println("���� ���� = "+sum);
		double avg = (double)sum/scores.length;
		System.out.println("���� ��� = "+avg);
		
	}

}
