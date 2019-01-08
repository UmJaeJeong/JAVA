package sec_verify04;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고자하는 원의 반지름을 입력하세요 : ");
		int x = sc.nextInt();
		Computer com = new Computer();
		Calculator cal = new Calculator();
		System.out.println("Calculator 객체의 areaCircle() 실행");
		System.out.print("원면적은 : "+cal.areaCircle(x));
		System.out.println();
		System.out.println("Computer 객체의 areaCircle() 실행");
		System.out.print("원면적은 : "+com.areaCircle(x));
	}

}
