package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		//차를 주문해서 자기가 직접 색깔도 바르고, 기어도 만들고,
		//문도 4개 로 마든것
		Car c1 = new Car();
		/*
		 * c1.color = "withe";
		 * c1.gearType = "auto";
		 * c1.door = 4;
;		 */
		
		//차를 주문할 때 색상, 기어, 문갯수를 지정해주는 형태
		Car c2 = new Car("흰색","auto",6);  //매개변수가 3개인 생성자 호출
		
		//toString메서드가 호출됨;
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
