package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		System.out.println("main");
		//static은 static만 부를수 있다.
		CallStackExample.firstMethod();
		System.out.println("main()을 끝냅니다.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()");
		//static은 static만 부를 수 있다.
		CallStackExample.SecondMethod();
		System.out.println("main()을 돌아갑니다.");
	}
	
	static void SecondMethod() {
		System.out.println("SecondMethod()");
		System.out.println("FirstMethod()을 돌아갑니다.");
	}
}
