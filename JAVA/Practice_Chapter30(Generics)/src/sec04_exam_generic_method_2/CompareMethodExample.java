package sec04_exam_generic_method_2;

public class CompareMethodExample {

	public static void main(String[] args) {
		// p1의 K타입이 Integer, V타입이 String임을 기억하자
		// (K와 V는 사용자가 원하는대로 정할 수있다.
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		// Pair<Apple,String> p1 = new Pair<>(new Apple(10),'사과);
		// Pair<Apple,String> p2 = new Pair<>(new Apple(10),'사과);
		Pair<Integer, String> p3 = new Pair<Integer, String>(4, "사과");

		// boolean result1 = Util.<Integer,String>compare(p1,p2) //jdk 1.6까찌\
		boolean result = Util.compare(p1, p2);

		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으로 동등하지않은 객체입니다.");

		result = Util.compare(p1, p3);

		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으로 동등하지않은 객체입니다.");

		Pair<String, String> p4 = new Pair<String, String>("사용자1", "남궁성");
		Pair<String, String> p5 = new Pair<String, String>("사용자1", "남궁성");

		result = Util.compare(p4, p5);

		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으로 동등하지않은 객체입니다.");

	}

}
