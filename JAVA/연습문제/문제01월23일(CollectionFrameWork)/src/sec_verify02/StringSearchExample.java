package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �̸��� �Է��Ͻǲ�����? >>");
		int x= sc.nextInt();
		longStringSearch lss = new longStringSearch(x);
		System.out.println(x+"��ŭ�� ArrayList�� �����Ǿ����ϴ�.");
		sc.nextLine();

		for(int i=0;i<x;i++) {
			System.out.print((i+1)+"��° �̸��� �Է��ϼ���>>");
			String str = sc.nextLine();
			lss.addString(str);
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("\r\n" + 
				"ArrayList�� ��� �ִ� ��� �̸��� ����մϴ�.");
		ArrayList<String> s = lss.getStringList();
		for(int i=0; i<s.size();i++) {
			System.out.println((i+1)+"��° ArrayList��ü �� : "+s.get(i));
		}
		System.out.println();
		System.out.println("���� �� �̸��� "+lss.longestString()+"�Դϴ�.");
		
		sc.close();
	}

}
