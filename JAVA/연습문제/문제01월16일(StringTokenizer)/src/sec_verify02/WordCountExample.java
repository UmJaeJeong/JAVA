package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�Է� :");
			String input = sc.nextLine();
			if(input.equals("exits")) break;
			System.out.println("");
			StringTokenizer st = new StringTokenizer(input," ");
			System.out.println("������ ����"+st.countTokens());
			int cnt = 0;
			while(st.hasMoreTokens()) {
				System.out.println("�и��� ["+(++cnt)+"]��° ���� : "+st.nextToken());
			}		
		}
		System.out.println("�����մϴ�....");
	}

}
