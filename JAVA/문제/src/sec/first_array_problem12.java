package sec;

import java.util.Scanner;

public class first_array_problem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores =null;
		int x=0;
		int a=0;
		
		do {
			System.out.println("---------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------------");
			System.out.print("����>");
			 x= sc.nextInt();
			 
			 switch(x) {
			 case 1:
				 System.out.print("�л���>");
				 a= sc.nextInt();
				 scores = new int[a];
				 break;		 
			 case 2:
				 for(int i=0; i<scores.length;i++) {
					 scores[i] = sc.nextInt();
				 }
				 break;
			 case 3:
				 if(scores!=null)
				 for(int i=0; i<scores.length;i++) {
					 System.out.println("score["+i+"]>"+scores[i]);
				 }
				 break;
			 case 4:
				 int max =0;
				 float avg =0.0f;
				 int sum=0;
				 for(int i=0; i<scores.length;i++) {
					 sum +=scores[i];
					 if(scores[i]<max) {
						 max = scores[i];
					 }
				 }
				 System.out.println("�ְ����� : "+max);
				 System.out.println("��� ���� : "+sum/(float)scores.length);
				 break;
			 case 5:
				 break;
			 }
			 
		}while(x!=5);
		System.out.println("�ý��� ����");
		
	}

}
