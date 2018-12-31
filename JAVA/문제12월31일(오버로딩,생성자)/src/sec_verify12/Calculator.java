package sec_verify12;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	int firstNum;
	int secondNum;
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.print("두 정수와 연산자를 입력하시오>>");
		cal.firstNum=cal.sc.nextInt();
		cal.secondNum=cal.sc.nextInt();
		cal.sc.nextLine();
		String operator = cal.sc.nextLine();
		
		switch(operator.charAt(0)) {
		case '+':
			Add a = new Add();
			a.setValue(cal.firstNum, cal.secondNum);
			System.out.println(a.calculate());
			break;
		case '-':
			Sub s = new Sub();
			s.setValue(cal.firstNum, cal.secondNum);
			System.out.println(s.calculate());
			break;
		case '/':
			Div d = new Div();
			d.setValue(cal.firstNum, cal.secondNum);
			System.out.println(d.calculate());
			break;
		case '*':
			Mul m = new Mul();
			m.setValue(cal.firstNum, cal.secondNum);
			System.out.println(m.calculate());
			break;
		}
		
	}

}
