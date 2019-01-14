package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {
		System.out.println("문자열을 대문자는 소문자로 소문자는 대문자로 변경합니다.");
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				
			}
		}
	}

}
