package sec05_exam_throws;

public class ThrowsExample02 {

	public static void main(String[] args) {
		method1(); //같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
		//main메서드 끝
	}
	
	public static void method1() {
		try {
			throw new Exception();	//예외 발생 시키고, method1에서 예외처리르 했다.
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

}
