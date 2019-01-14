package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.print("내용을 거꾸로 출력 ==> ");
		for(int  i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
