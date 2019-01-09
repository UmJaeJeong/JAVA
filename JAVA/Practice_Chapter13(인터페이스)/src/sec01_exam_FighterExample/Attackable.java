package sec01_exam_FighterExample;

public interface Attackable {
	//public abstract 생략가능함(컴파일러가 알아서 붙여줌)
	void attack(Unit u); //매개변수에 Unit u라는 인스턴스를 받는다? 이 의미는 무엇인가?
						 //Unit을 인스턴스화한 객체이거나 Unit의 자손들일 경우에만 매개변수로 들어올수 있다.
	
}
