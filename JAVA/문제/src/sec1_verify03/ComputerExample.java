package sec1_verify03;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		Scanner sc = new Scanner(System.in);
		System.out.printf("1차원 배열을 만듭니다.%n배열수를 입력:");
		int x = sc.nextInt();
		System.out.println("해당 배열 방에 정수를 입력하세요.");

		int[] value = new int[x];
		
		for(int i=0; i<x;i++) {
			System.out.print("values["+i+"] = ");
			int y = sc.nextInt();
			value[i] = y;
		}
		
		System.out.print("%n입력하신 1차원 배열의 값을 출력합니다.");
		for(int i=0; i<x;i++) {
			System.out.println("values["+i+"] = "+value[i]);
		}
		System.out.println("Computer인스턴스 멤버메서드 sum을 호출한 결과는 "+com.sum(value)+"입니다.");
	}

}
