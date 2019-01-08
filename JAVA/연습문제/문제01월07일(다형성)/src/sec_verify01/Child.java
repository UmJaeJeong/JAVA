package sec_verify01;

public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("오버라이딩한 자손클래스 메서드2 호출");

	}
	
	public void method3() {
		System.out.println("자손클래스 메서드3 호출");
	}
}
