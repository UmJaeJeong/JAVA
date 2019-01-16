package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//아래 코드를 이해하는 것은 너무나 중요하다.
		Box box = new Box();
		
		//아래 2번의 캐스팅이 이루어지고 있음을 알수가 있다.
		box.setObject("홍길동");//String타입으로 매개변수로 던졌다(자동타입변환) =>1번
		String name = (String)box.getObject();//Object로 가져와 String으로 강제타입 변환 =>2번
		System.out.println(name);
	}

}
