package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		System.out.println("main");
		//static�� static�� �θ��� �ִ�.
		CallStackExample.firstMethod();
		System.out.println("main()�� �����ϴ�.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()");
		//static�� static�� �θ� �� �ִ�.
		CallStackExample.SecondMethod();
		System.out.println("main()�� ���ư��ϴ�.");
	}
	
	static void SecondMethod() {
		System.out.println("SecondMethod()");
		System.out.println("FirstMethod()�� ���ư��ϴ�.");
	}
}
