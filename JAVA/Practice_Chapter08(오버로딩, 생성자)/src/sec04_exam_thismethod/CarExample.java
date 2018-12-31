package sec04_exam_thismethod;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("Green","수동");
		
		System.out.println(c1.toString());//여기서 생략된 메서드느 ㄴ무엇인가?
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
