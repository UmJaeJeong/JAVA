package sec_verify04;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		Random rand1 = new Random();

		System.out.println("�ζ� ��ȣ ������ ���α׷��Դϴ�.");
		System.out.println("�ڵ����� ��ȣ�� �����մϴ�.");
		System.out.print("���� ��ȣ : ");
		int[] choice = new int[6];
		int[] choice1 = new int[6];

		for(int i=0 ; i<6;i++) {
			choice[i] = (int)(Math.random()*44+1);
			System.out.print(choice[i]+" ");
		}
		System.out.println();
		System.out.print("��÷ ��ȣ : ");
		for(int i=0; i<6;i++) {
			choice1[i] =(int)(Math.abs(rand1.nextInt()%44)+1);
			System.out.print(choice1[i]+" ");
		}
		
		Arrays.sort(choice);
		Arrays.sort(choice1);
		
		boolean check =false;
		for(int i=0; i<6;i++) {
			if(choice[i]==choice1[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		System.out.println();
		if(!check) System.out.println("��÷ ���� :  ��÷���� �ʾҽ��ϴ�.");
	}

}
