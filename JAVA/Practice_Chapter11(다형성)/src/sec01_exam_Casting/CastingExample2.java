package sec01_exam_Casting;

public class CastingExample2 {

	public static void main(String[] args) {
		//Car car = new Car();//인스턴스 생성
		Car car = new FireEngine();
		//Car car = null;	//Car인스턴스 생성
		
		//다형성 : 조상타입의 참조변수를 가지고 자손타입의 인스턴스를 다룰수 있다.
		//(리모컨의 기능 많음 -> 적음으로 가능),반대로 불가능
		//Car car = new FireEngin(); //이런식으로 가능함
		
		
		//Car2는 null초기화
		Car car2 = null;
		FireEngine fe = new FireEngine();
		
		//Car에 drive()메서드 호출
		car.drive();
		//자손타입의 인스턴스를 가지고 조상타입의 인스턴스를 다룰수 없다.
		//(리모컨의 기능이 적음 -> 많음으로 불가),
		//반대로 허용
		//car = fe; 
		fe = (FireEngine)car;	//컴파일은 OK, 실행시 에러가 발생(ClassCastException발생)
								//
		fe.drive();
		car2 = fe;
		car2.drive();
		fe.water();
	}

}
