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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택>");
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
				System.out.println("프로그램 종료");
				break;
			default:
					
			}
		}while(x!=5);
		
		
	}
	
	private static void createAccount() {
		//계좌생성
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		accountArray[count] = new Account("","",0);
		System.out.print("계좌번호: ");
		String a = scanner.next();
		accountArray[count].setAno(a);
		
		System.out.print("계좌주: ");
		String b = scanner.next();
		accountArray[count].setOwner(b);
		
		System.out.print("초기입금액: ");
		int c=scanner.nextInt();
		accountArray[count].setBalance(c);		
		count++;
	}
	
	private static void accountList() {
		//계좌목록
		for(int i=0; i<count;i++) {
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String s = scanner.next();
		
		System.out.print("예금액: ");
		int q = scanner.nextInt();
		findAccount(s).setBalance(q);
		System.out.println("예금액: "+q);
		System.out.println("결과: 예금이 성공되었습니다.");
		//예금하기
	}
	
	private static void withdraw() {
		//출금하기
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String s = scanner.next();
		
		
		System.out.print("출금액: ");
		int q = scanner.nextInt();
		findAccount(s).setBalance(-q);
		System.out.println("출금액:"+q);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	private static Account findAccount(String ano) {
		//Account배열에서 ano와 동일한 Account찾기
		Account ret = null;
		for(Account a : accountArray) {
			if(a.getAno().equals(ano)) {
				ret=a;
				break;
			}
		}
		if(ret == null) {
			System.out.println("등록한 계좌가 없습니다.");
		}
		return ret;
	}

}
