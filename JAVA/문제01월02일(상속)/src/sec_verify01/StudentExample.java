package sec_verify01;

import java.util.Scanner;

public class StudentExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�й��� �Է��ϼ��� : ");
		String number = sc.nextLine();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		Student student = new Student(name, number);

		System.out.println(student.toString());


	}

}
