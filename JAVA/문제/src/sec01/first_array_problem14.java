package sec01;

import java.util.Scanner;

public class first_array_problem14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] day = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("���� �Է��ϼ��� :");

		int x = sc.nextInt();
		if(x>=1&& x<=12)
		System.out.println(x+"���� �ϼ��� : "+day[x-1]+"�Դϴ�.");
		else System.out.println("�߸� �Է��߽��ϴ�.");

	}

}
