package sec03_exam_Multi_Catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			//무슨 예외가 발생할 수 있나?
			String data1 = args[0];
			String data2 = args[1];
			//이건 무슨예외가 발생할수 있나?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1+value2;
			
			System.out.println(data1+"+"+data2+"+"+result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("실행매개값이 부족합니다.");
			System.out.println("실행방법 java CatchByExceptionKindExample num1 num2");
			System.out.println("프로그램을 정상종료합니다.");
			
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println("숫자로 변환할수 없습니다. 매개변수의 값을 확인하세요!");
			System.out.println("프로그램을 정상종료합니다.");
		}finally {
			System.out.println("다시 실행하세요!");
		}
	}

}
