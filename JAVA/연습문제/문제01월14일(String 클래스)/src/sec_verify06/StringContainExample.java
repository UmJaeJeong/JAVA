package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��غ����� : ");
		String str = sc.nextLine();
		System.out.print("�� ��° ������ �Է��غ����� : ");
		String str1 = sc.nextLine();
		
		if(str.startsWith("I") &&str1.startsWith("I")) {
			str ="["+str;
			str1 ="["+str1;
		}
		
		if(str.endsWith("a") &&str1.endsWith("a")) {
			str =str+"]";
			str1 =str1+"]";
		}
		
		if(str.equals(str1)) {
			System.out.println("�Է��� �� ������ ���� �����̳׿�.");
		}
		
		if(str.indexOf("Java")!=-1 && str1.indexOf("Java")!=-1 ) {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ��ֳ׿�.");
		}
	}

}
