package sec02_exam_generic_type;

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
