package sec04_exam_generic_method_1;

public class Util {
	
	//<T>는 제네릭타입 메서드를 의미하여, 리턴타입과 매개변수 제네릭 타입을
	//<T>로 하겠다는 의미 외부로부터 T타입을 받아서 Box객체를 생성하여
	//그 객체를 리턴하는 메서드
	public static<T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
		//return this.box; static 메서드에서 this를 사용할수 없다.
	}
}
