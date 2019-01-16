package sec03_exam_nultitype_parameter;

public class Product<T, M> {
	private T t;
	private M m;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	
	
}
