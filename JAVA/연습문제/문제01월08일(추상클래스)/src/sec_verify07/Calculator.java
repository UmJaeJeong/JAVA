package sec_verify07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("두 정수와 연산자를 입력하시오.");
			System.out.print("(종료를 원하시면 -1을 입력해주세요)>>");
			double a = sc.nextDouble();
			if(a==-1) break;
			double b= sc.nextDouble();
			char an =sc.next().charAt(0);
			
			switch(an) {
			case '+':
				Add ad = new Add();
				ad.setValue(a, b);
				System.out.printf("%.1f%c%.1f=%.1f",a,an,b,ad.calculate());
				break;
				
			case '-':
				Sub sb = new Sub();
				sb.setValue(a, b);
				System.out.printf("%.1f%c%.1f=%.1f",a,an,b,sb.calculate());
				break;
				
			case '*':
				Mul ml = new Mul();
				ml.setValue(a, b);
				System.out.printf("%.1f%c%.1f=%.1f",a,an,b,ml.calculate());
				break;
				
			case '/':
				Div dv = new Div();
				dv.setValue(a, b);
				System.out.printf("%.1f%c%.1f=%.1f",a,an,b,dv.calculate());
				break;
				default:
				System.out.println("잘못된 연산자입니다.");
			}
			System.out.println();
			
		}
		System.out.println("계산기를 종료합니다");
	sc.close();
	}

}
