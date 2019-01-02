package sec_verify01;

import java.util.Scanner;

public class StudentExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력하세요 : ");
		String number = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		Student student = new Student(name, number);

		System.out.println(student.toString());


	}

}
