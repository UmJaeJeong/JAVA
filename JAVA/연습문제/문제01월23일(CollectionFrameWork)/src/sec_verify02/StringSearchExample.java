package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 이름을 입력하실껀가요? >>");
		int x= sc.nextInt();
		longStringSearch lss = new longStringSearch(x);
		System.out.println(x+"만큼의 ArrayList가 생성되었습니다.");
		sc.nextLine();

		for(int i=0;i<x;i++) {
			System.out.print((i+1)+"번째 이름을 입력하세요>>");
			String str = sc.nextLine();
			lss.addString(str);
		}
		System.out.println("입력이 완료되었습니다.");
		System.out.println();
		System.out.println("\r\n" + 
				"ArrayList에 들어 있는 모든 이름을 출력합니다.");
		ArrayList<String> s = lss.getStringList();
		for(int i=0; i<s.size();i++) {
			System.out.println((i+1)+"번째 ArrayList객체 값 : "+s.get(i));
		}
		System.out.println();
		System.out.println("가장 긴 이름은 "+lss.longestString()+"입니다.");
		
		sc.close();
	}

}
