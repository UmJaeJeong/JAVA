package sec_verify07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�.");
			System.out.print("(���Ḧ ���Ͻø� -1�� �Է����ּ���)>>");
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
				System.out.println("�߸��� �������Դϴ�.");
			}
			System.out.println();
			
		}
		System.out.println("���⸦ �����մϴ�");
	sc.close();
	}

}
