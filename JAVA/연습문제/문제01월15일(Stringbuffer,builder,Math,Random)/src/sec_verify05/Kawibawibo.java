package sec_verify05;

import java.util.Scanner;

public class Kawibawibo {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		final String[] str= new String[] {"����", "����", "��"};
		
		
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���>>");
			int choice = sc.nextInt();
			int com = (int)(Math.random()*3);
			System.out.println("��ǻ�ʹ� "+str[com]+"���½��ϴ�.");
			if(choice == 4) break;
			switch(choice) {
			case 1:
				if(com == 0)System.out.println("�����ϴ�.");
				if(com == 1)System.out.println("�����ϴ�.");
				if(com == 2)System.out.println("�̰���ϴ�.");

				break;
			case 2:
				if(com == 0)System.out.println("�̰���ϴ�..");
				if(com == 1)System.out.println("�����ϴ�.");
				if(com == 2)System.out.println("�����ϴ�.");
				break;
			case 3:
				if(com == 0)System.out.println("�����ϴ�.");
				if(com == 1)System.out.println("�̰���ϴ�.");
				if(com == 2)System.out.println("�����ϴ�.");
				break;
				
				default:
					System.out.println("�߸��Է� �߽����ϴ�.");
			}
			
			
		}
		
		System.out.println("���� ����");
	}

}
