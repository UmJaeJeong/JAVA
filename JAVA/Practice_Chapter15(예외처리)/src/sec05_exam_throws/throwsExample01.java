package sec05_exam_throws;

public class throwsExample01 {

	public static void main(String[] args) {
		try {
			method1();//같은 클래스내에 static멤버이므로 객체 생성없이 직적 호출가능.
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//main메서드의 끝
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception(); //예외발생시점
		//method2의 끝
	}

}
