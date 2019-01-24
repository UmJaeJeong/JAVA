package sec_verify07;

import java.util.Stack;

public class StackEx {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		back.push("1.����Ʈ");
		back.push("2.����");
		back.push("3.���̹�");
		back.push("4.����");
		printStatus();
	
		
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		goBack();
		printStatus();
		
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		goBack();
		printStatus();
		
		System.out.println("= '������' ��ư�� ���� �� =");
		goForward();
		printStatus();
		
		System.out.println("= ���ο� �ּҷ� �̵� �� =");
		goURL("dgit.com");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back : "+back.toString());
		System.out.println("forward : "+forward.toString());
		System.out.println("���� ȭ���� '"+back.peek()+"' �Դϴ�.");
		System.out.println();
	}

	public static void goURL(String url) {
		back.push(url);
		forward.pop();
	}

	public static void goForward() {
		back.push(forward.pop());

	}

	public static void goBack() {
		forward.push(back.pop());
	}
}
