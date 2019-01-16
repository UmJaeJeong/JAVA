package sec01_exam_non_generic_type;

public class Box {
	
	private Object object;

	//getter
	public Object getObject() {
		return object;
	}

	//stter
	//매개변수, Object라는 것은 모든 클래스를 매개변수로 받겠다느 의미(다형성)
	public void setObject(Object object) {
		this.object = object;
	}
	
}
