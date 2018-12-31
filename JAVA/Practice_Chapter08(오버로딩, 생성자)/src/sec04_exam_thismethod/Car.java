package sec04_exam_thismethod;


public class Car {
	String color;
	String gearType;
	int door;
	
	//생성자
	//아무런 생성자가 선언되어 있지 않다면, 컴파일러가 알아서 기본생성자를
	//추가해준다는 것을 명심하자
	
	public Car() {
		this("white","auto",4);
		System.out.println("기본생성자 호출");
	}
	
	public Car(String color) {
		this(color,"auto",4);
		System.out.println("매개변수가 있는 생성자 호출");

	}
	
	public Car(String color, String gearType) {
		this(color,gearType,4);
		System.out.println("매개변수가 있는 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("매개변수가 있는 생성자 호출");
	}
	//이노테이션(annotation) : 컴파일러에게 강하게 체크를하라는 뜻.
	
	@Override
	public String toString() {
		String str= "색깔 ="+this.color+" 기어타입="+this.gearType+" 문갯수="+this.door;
		return str;
	}
}
