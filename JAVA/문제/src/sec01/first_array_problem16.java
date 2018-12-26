package sec01;

import java.util.Scanner;

public class first_array_problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = "code";
		while(true) {
			System.out.print("암호 4자를 입력하세요 : ");
			String password = sc.nextLine();
			if(answer.equals(password))break;
			else System.out.println("다시 입력하세요. 주인 맞나요?");

		}
		System.out.println("딩동뎅!!어서 들어오세요^^");
		System.out.println("프로그램을 종료합니다." + 
				"");

	}

}
