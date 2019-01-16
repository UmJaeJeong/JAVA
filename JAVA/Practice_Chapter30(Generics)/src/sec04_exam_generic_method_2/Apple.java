package sec04_exam_generic_method_2;

public class Apple {
	private int key;
	
	public Apple(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return this.key+" ";
	}
}
