package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ������ �Է��غ����� : ");
		String str = sc.nextLine();
		if(str.startsWith("��"))
			str = "["+str;
		if(str.endsWith("��"))
			str = str+"]";

		System.out.println("�Է��� ���ڿ� : "+str);
		
		String[] arr = str.split(" ");
		str ="";
		for(String s : arr)
			str+=s;
		System.out.println("�������Ÿ� �� ���ڿ� : "+str);
			
		sc.close();
	}

}
