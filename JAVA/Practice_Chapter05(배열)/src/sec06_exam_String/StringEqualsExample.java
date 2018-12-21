package sec06_exam_String;

public class StringEqualsExample {

	public static void main(String[] args) {
		//strVar1, strVar2 참조변수지만 값이 "남궁성" heap한공간으로 차지하면서,
		//같은 곳을 가리키고 있는 형태.
		String strVar1 = "남궁성";
		String strVar2 = "남궁성";
		
		/*
		 * Object obj1 = new Object();
		 * Object obj2 = new Object();
		 * if(!(obj1 == obj2)){
		 * 	System.out.println("1참조가 같음");
		 * if(!(obj1.equals(obj2))){
		 * System.out.println("2참조가 같음");
		 */

		//String객체에서 == 연산은 주소값비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		//String객체에서 equals연산은 값 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		//new연산자는 항상 새로운 heap메모리 할당
		String strVar3 = new String("남궁성");
		String strVar4= new String("남궁성");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
