package sec04_exam_generic_method_1;

//BoxŬ������ ���׸�Ÿ������ ���Ը���
public class Box<T> {
//���� �κп� �����̵��� �� ���� �ִ�. !! ��) �ν��Ͻ�ȭ�� ��ü�� ���� �ִ�.
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
