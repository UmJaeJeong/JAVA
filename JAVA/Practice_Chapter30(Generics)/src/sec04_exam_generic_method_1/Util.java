package sec04_exam_generic_method_1;

public class Util {
	
	//<T>�� ���׸�Ÿ�� �޼��带 �ǹ��Ͽ�, ����Ÿ�԰� �Ű����� ���׸� Ÿ����
	//<T>�� �ϰڴٴ� �ǹ� �ܺηκ��� TŸ���� �޾Ƽ� Box��ü�� �����Ͽ�
	//�� ��ü�� �����ϴ� �޼���
	public static<T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
		//return this.box; static �޼��忡�� this�� ����Ҽ� ����.
	}
}
