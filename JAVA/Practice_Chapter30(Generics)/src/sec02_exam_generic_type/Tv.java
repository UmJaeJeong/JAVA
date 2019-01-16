package sec02_exam_generic_type;

public class Tv<T> {

	//아래 T는 개발시 사용자가 구체적 타입으로 결정하면
	//그타입으로 모두 변경됨을 잊지 말자
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
