package sec02_exam_InstanceOf;
//부모클래스
class Car{}
//자식클래스
class FireEngine extends Car{}

public class InstanceofExample2 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		//Car car = new Car();
		
		//instanceof연산자의 결과가 참이면 형변환이 가능하다라는 것에 주목!
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		//참조변수.getClass()는 참조변수의 인스턴스를 가져와라는 메서드이며,
		//getName()는 해당클래스의 패키지와 클래스명을 출력하는 것이다.
		//또한, getSimpleName()은 패키지명은 제외하고, 단순 클래스명만 출력하는 메서드이다.
		System.out.println(fe.getClass().getName());
		System.out.println(fe.getClass().getSimpleName());

	}

}
