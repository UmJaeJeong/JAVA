package sec;

import java.util.Scanner;

public class first_array_problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int last=0;
		System.out.println("���ϴ� ������ ��� �Է��ϼ���(-1�� �Է��ϸ� ���������ϴ�) :");
		for(int i=0; i<100;i++) {
			int x= sc.nextInt();
			if(x==-1) break;
			a[i] = x;
			last = i;		
		}
		System.out.print("������ 3���� ���� ");

		for(int i=last-3;i<=last;i++) {
			System.out.print(a[i]);
		}
		System.out.print("�̳׿�...");

	}

}
