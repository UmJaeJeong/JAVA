package sec_verify04;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϰ����ϴ� ���� �������� �Է��ϼ��� : ");
		int x = sc.nextInt();
		Computer com = new Computer();
		Calculator cal = new Calculator();
		System.out.println("Calculator ��ü�� areaCircle() ����");
		System.out.print("�������� : "+cal.areaCircle(x));
		System.out.println();
		System.out.println("Computer ��ü�� areaCircle() ����");
		System.out.print("�������� : "+com.areaCircle(x));
	}

}
