package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {
	
	public static Stack st = new Stack();
	public static String expression1 = "( (2*7) + 3 - 1)";
	public static String expression2 = "( (2*7) + 3 - 1";

	public static void main(String[] args) {
		System.out.println("expression1:"+expression1);

		ExpressionCheck(expression1);
		System.out.println("expression2:"+expression2);

		ExpressionCheck(expression2);
	}
	
	public static void ExpressionCheck(String expression) {
		int data =0;
		boolean check = false;
		for(int i=0; i<expression.length();i++) {
			if(expression.charAt(i)=='(') {
				data++;
			}else if(expression.charAt(i)==')') {
				if(data<=0) {
					check = false;
					break;
				}else {
					data--;
				}
			}
		}
		
		if(data ==0 ) {
			check = true;
		}
		
		if(check) {
			System.out.println("괄호가 일치합니다.");
		}else {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}
