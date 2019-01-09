package sec04_exam_Default_StaticMethod_Example;

public class Child extends Parent implements MyInterface1, MyInterface2{
	
	
	public void Childmethod() {
		System.out.println("자손클래스에서 호출한 메서드");
	}
	
	@Override
	public void method1() {
		System.out.println("자손클래스에서 MyInterface1의 method1()을"+" 오버라이딩한 메서드");
	}
}
