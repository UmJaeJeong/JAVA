package sec01;

import java.util.Scanner;

public class first_array_problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = "code";
		while(true) {
			System.out.print("��ȣ 4�ڸ� �Է��ϼ��� : ");
			String password = sc.nextLine();
			if(answer.equals(password))break;
			else System.out.println("�ٽ� �Է��ϼ���. ���� �³���?");

		}
		System.out.println("������!!� ��������^^");
		System.out.println("���α׷��� �����մϴ�." + 
				"");

	}

}
