package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.print("������ �Ųٷ� ��� ==> ");
		for(int  i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
