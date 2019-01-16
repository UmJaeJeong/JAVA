package sec04_exam_generic_method_1;

//Box클래스를 제네릭타입으로 설게를함
public class Box<T> {
//꺽새 부분에 무엇이든지 다 들어갈수 있다. !! 단) 인스턴스화한 객체만 들어갈수 있다.
	private T t;

	//getter
	public T getT() {
		return t;
	}
	
	//setter
	public void setT(T t) {
		this.t = t;
	}
	
}
