package sec05_exam_instance_copy;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		c2.door = 100;
		c2.color = "노랑색";
		
		Car c3 = new Car(c1);

		System.out.println(c1.toString());//여기서 생략된 메서드느 ㄴ무엇인가?
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
