package sec2_verify10;

import java.util.Scanner;

public class BackApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	
	public static void main(String[] args) {
		int x = 0;
		do {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����>");
			x = scanner.nextInt();
			
			switch(x) {
			case 1:
				createAccount();
				break;
				
			case 2:
				accountList();
				break;
				
			case 3:
				deposit();
				break;	
			case 4:
				withdraw();
				break;
				
			case 5:
				System.out.println("���α׷� ����");
				break;
			default:
					
			}
		}while(x!=5);
		
		
	}
	
	private static void createAccount() {
		//���»���
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		accountArray[count] = new Account("","",0);
		System.out.print("���¹�ȣ: ");
		String a = scanner.next();
		accountArray[count].setAno(a);
		
		System.out.print("������: ");
		String b = scanner.next();
		accountArray[count].setOwner(b);
		
		System.out.print("�ʱ��Աݾ�: ");
		int c=scanner.nextInt();
		accountArray[count].setBalance(c);		
		count++;
	}
	
	private static void accountList() {
		//���¸��
		for(int i=0; i<count;i++) {
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String s = scanner.next();
		
		System.out.print("���ݾ�: ");
		int q = scanner.nextInt();
		findAccount(s).setBalance(q);
		System.out.println("���ݾ�: "+q);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		//�����ϱ�
	}
	
	private static void withdraw() {
		//����ϱ�
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String s = scanner.next();
		
		
		System.out.print("��ݾ�: ");
		int q = scanner.nextInt();
		findAccount(s).setBalance(-q);
		System.out.println("��ݾ�:"+q);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	private static Account findAccount(String ano) {
		//Account�迭���� ano�� ������ Accountã��
		Account ret = null;
		for(Account a : accountArray) {
			if(a.getAno().equals(ano)) {
				ret=a;
				break;
			}
		}
		if(ret == null) {
			System.out.println("����� ���°� �����ϴ�.");
		}
		return ret;
	}

}
