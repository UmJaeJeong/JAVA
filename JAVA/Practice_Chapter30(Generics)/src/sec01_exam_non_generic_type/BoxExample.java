package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//�Ʒ� �ڵ带 �����ϴ� ���� �ʹ��� �߿��ϴ�.
		Box box = new Box();
		
		//�Ʒ� 2���� ĳ������ �̷������ ������ �˼��� �ִ�.
		box.setObject("ȫ�浿");//StringŸ������ �Ű������� ������(�ڵ�Ÿ�Ժ�ȯ) =>1��
		String name = (String)box.getObject();//Object�� ������ String���� ����Ÿ�� ��ȯ =>2��
		System.out.println(name);
	}

}
