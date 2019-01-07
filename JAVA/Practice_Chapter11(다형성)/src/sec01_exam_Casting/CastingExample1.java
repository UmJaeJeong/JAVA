package sec01_exam_Casting;

public class CastingExample1 {

	public static void main(String[] args) {
		Car car  = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (Car)fe;에서 형변환이 생략된 형태이다.(다형성)
		//car.water();	//컴파일 예외가 발생한다.? 이유는? car의 근본이 무엇인가?
		fe2 = (FireEngine)car;	//자손타입 <- 조상타입
		fe2.water();
	}

}
