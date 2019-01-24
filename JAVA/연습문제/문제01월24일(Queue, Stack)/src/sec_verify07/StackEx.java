package sec_verify07;

import java.util.Stack;

public class StackEx {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		back.push("1.네이트");
		back.push("2.야후");
		back.push("3.네이버");
		back.push("4.다음");
		printStatus();
	
		
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		goBack();
		printStatus();
		
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		goBack();
		printStatus();
		
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		goForward();
		printStatus();
		
		System.out.println("= 새로운 주소로 이동 후 =");
		goURL("dgit.com");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back : "+back.toString());
		System.out.println("forward : "+forward.toString());
		System.out.println("현재 화면은 '"+back.peek()+"' 입니다.");
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
