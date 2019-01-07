package sec02_exam_InstanceOf;
//부모클래스
class Parent{}
//자식클래스
class Child extends Parent{}

public class InstanceofExample {

	//주목할것은 매개변수가 조상타입이라는 것에 집중하자.
	public static void method1(Parent parent) {
		//서로 상속 관계에 있어서 instanceof연산자의 결과가 true이므로 강제캐스팅이 가능
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환 실패");
		}
			
	}
	
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			parent = new Child();
			//Child child =(Child)parent;
			System.out.println("method2 - Child로 변환 성공");

		}else {
			System.out.println("method2 - Child로 변환 실패");

		}
	}
	
	public static void main(String[] args) {
		//parentA는 현재 다형성이 적용이 된 코드이고, parentB는 다형성이 미적용된 코드
		Parent parentA = new Child();
		method1(new Child());
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//다형성이 적용되면서 메서드 호출이 되어 변환이 가능하다.
		method1(new Child());
		method2(parentB);
	}

}
