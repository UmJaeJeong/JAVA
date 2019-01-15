package sec_verify05;

import java.util.Scanner;

public class Kawibawibo {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		final String[] str= new String[] {"가위", "바위", "보"};
		
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");
			int choice = sc.nextInt();
			int com = (int)(Math.random()*3);
			System.out.println("컴퓨터는 "+str[com]+"을냈습니다.");
			if(choice == 4) break;
			switch(choice) {
			case 1:
				if(com == 0)System.out.println("비겼습니다.");
				if(com == 1)System.out.println("졌습니다.");
				if(com == 2)System.out.println("이겼습니다.");

				break;
			case 2:
				if(com == 0)System.out.println("이겼습니다..");
				if(com == 1)System.out.println("비겼습니다.");
				if(com == 2)System.out.println("졌습니다.");
				break;
			case 3:
				if(com == 0)System.out.println("졌습니다.");
				if(com == 1)System.out.println("이겼습니다.");
				if(com == 2)System.out.println("비겼습니다.");
				break;
				
				default:
					System.out.println("잘못입력 했습습니다.");
			}
			
			
		}
		
		System.out.println("게임 종료");
	}

}
