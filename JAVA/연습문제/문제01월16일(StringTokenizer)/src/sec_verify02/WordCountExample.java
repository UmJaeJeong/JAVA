package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력 :");
			String input = sc.nextLine();
			if(input.equals("exits")) break;
			System.out.println("");
			StringTokenizer st = new StringTokenizer(input," ");
			System.out.println("낱말의 개수"+st.countTokens());
			int cnt = 0;
			while(st.hasMoreTokens()) {
				System.out.println("분리된 ["+(++cnt)+"]번째 낱말 : "+st.nextToken());
			}		
		}
		System.out.println("종료합니다....");
	}

}
