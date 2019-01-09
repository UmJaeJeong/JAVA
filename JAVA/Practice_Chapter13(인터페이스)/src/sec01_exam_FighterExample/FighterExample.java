package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		//Unit f - new Fighter();
		/*
		 * A instanceof B 란 : A가 B타입일 경우 true를 반환한다;
		 * 즉, A가 B로 형변환(TypeCasting)된다는 의미다.(조상클래스란 말이다.)
		 * 다형성의 개념을 떠올려보자.(조상타입의 참조변수로 자손타입의 인스턴스를 참조할수 있다는 것.)
		 * 상속 계층도를 그려보자.
		 */
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}

		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");

		}

		if(f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현했습니다.");

		}

		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");

		}
		
		//재정의된 추상메서드 호출
		f.move(0, 0);
		f.attack(null);
	}

}
