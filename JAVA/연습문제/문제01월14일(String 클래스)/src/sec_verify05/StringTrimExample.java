package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 문장을 입력해보세요 : ");
		String str = sc.nextLine();
		if(str.startsWith("저"))
			str = "["+str;
		if(str.endsWith("요"))
			str = str+"]";

		System.out.println("입력한 문자열 : "+str);
		
		String[] arr = str.split(" ");
		str ="";
		for(String s : arr)
			str+=s;
		System.out.println("공백제거를 한 문자열 : "+str);
			
		sc.close();
	}

}
