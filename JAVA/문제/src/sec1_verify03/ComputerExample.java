package sec1_verify03;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		Scanner sc = new Scanner(System.in);
		System.out.printf("1���� �迭�� ����ϴ�.%n�迭���� �Է�:");
		int x = sc.nextInt();
		System.out.println("�ش� �迭 �濡 ������ �Է��ϼ���.");

		int[] value = new int[x];
		
		for(int i=0; i<x;i++) {
			System.out.print("values["+i+"] = ");
			int y = sc.nextInt();
			value[i] = y;
		}
		
		System.out.print("%n�Է��Ͻ� 1���� �迭�� ���� ����մϴ�.");
		for(int i=0; i<x;i++) {
			System.out.println("values["+i+"] = "+value[i]);
		}
		System.out.println("Computer�ν��Ͻ� ����޼��� sum�� ȣ���� ����� "+com.sum(value)+"�Դϴ�.");
	}

}
