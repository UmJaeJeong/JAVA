package sec04_exam_throw;

public class ThrowExample01 {

	public static void main(String[] args) {
		try {
			throw new Exception("고의로 발생시킴");
		}	
		//Exception클래스는 모든 예외의 조상이므로 어떤 예외도 다 받을수 있다.
		catch(Exception e) {
			System.out.println("에러메세지 : "+e.getMessage());
			//스택 메모리에 있는 내용까지 출력(개발용)
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
	
/*	public static void method() throws Exception{
		throw new Exception("고의로 발생시킴");
	}*/

}
