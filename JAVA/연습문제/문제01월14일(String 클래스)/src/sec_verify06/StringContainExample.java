package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 문장을 입력해보세요 : ");
		String str = sc.nextLine();
		System.out.print("두 번째 문장을 입력해보세요 : ");
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
			System.out.println("입력한 두 문장은 같은 문장이네요.");
		}
		
		if(str.indexOf("Java")!=-1 && str1.indexOf("Java")!=-1 ) {
			System.out.println("입력한 두 문장에는 Java가 포함되어있네요.");
		}
	}

}
