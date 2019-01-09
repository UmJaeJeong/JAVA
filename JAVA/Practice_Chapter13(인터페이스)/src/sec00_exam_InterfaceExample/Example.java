package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {
		//인터페이스를 구현했는라는 것은 구현클래스의 일종의 조상을 의미한다.
		//그래서 다형성이 적용된다.
		A a = new Person();
		Person p  = new Person();
		
		a.method();
		//a.method2();//예외발생? 이유? 근본이 A이므로 인터페이스에는 method2라는 함수가 정의 되어 있지 않다.
		p.method();
		
		A a1 = new Member();
		a1.method();
	}

}
