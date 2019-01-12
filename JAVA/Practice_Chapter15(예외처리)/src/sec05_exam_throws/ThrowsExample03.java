package sec05_exam_throws;

public class ThrowsExample03 {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
	
	//ClassNotFoundException예외를 호출한곳으로 떠넘기기
	public static void findClass() throws ClassNotFoundException{
		//ClassNotFoundException가 발생가능한 일반 예외이다.
		Class clazz = Class.forName("java.lang.String2");
	}

}
