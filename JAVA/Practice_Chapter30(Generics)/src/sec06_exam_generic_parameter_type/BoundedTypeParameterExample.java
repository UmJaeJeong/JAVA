package sec06_exam_generic_parameter_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//int result = Util.compare(("홍길동", "김동길");					//에러난다 이유는? Number클래스 포함한 자식들만 들어올 수있다.
		//int result2 = Util.<Integer>compare(100.1,200); 					//에러난다 이유는? <Integer>이라고 왔는대 Double형이 들어왔따.
		//int result3 = Util.compare(new Object(), new Object());			//에러난다 이유는? Obejct는 상위클래스이므로 못들온다.
		//int result5 = Util.<Integer>compare(new Number(), new Number());	//에러난다 이유는? Number클래스는 추상클래스이므로 객체를 생성할수 없다.
		
		//직접 객체를 생성해서 넘기는 형태지만 그냥 숫자값 넣으면 자동 박싱이 된다.
		int result = Util.compare(100, 200);
		System.out.println(result);
		result = Util.compare(new Integer(100), new Integer(200));
		System.out.println(result);
		result = Util.compare(new Double(200), new Double(400.77));
		System.out.println(result);
		result = Util.compare(4.5, 1);		
		System.out.println(result);
		result = Util.compare(4.5, 4.5);
	}

}
