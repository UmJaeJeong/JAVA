package sec06_exam_generic_parameter_type;

public class Util {

	//매개변수가 T타입을 <T extends Number>계 선언한 것은
	//Number클래스이거나 자손클래스만 적용되도록 제한을 함.
	public static <T extends Number> int compare(T t1, T t2) {
		//Number클래스의 doubleValue()란 추상메서드를 이용홤.
		//결과론적으로 Number클래스를 상속받는 클래스 줌
		//doubleValue()추상메서드를 재정의를 한 클래스만 가능하다고 보면 된다.
		
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		//Double클래스의 정적메서드인 compare()를 이용, 용도를 모르면 API를 보자.
		return Double.compare(value1, value2);
	}
}
