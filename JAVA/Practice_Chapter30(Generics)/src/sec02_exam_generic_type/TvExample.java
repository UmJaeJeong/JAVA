package sec02_exam_generic_type;

public class TvExample {

	public static void main(String[] args) {
		//��ü�� Ÿ������ String�� ����
		Tv<String> tv1 = new Tv<String>();
		//Tv<String> tv =new Tv<>();
		//�̷��� �����ص� �����ϴ� ������ �̰� �����׸� �ڵ��� Object�� ���°� �ȴ�.
		//Tv tv = new Tv();
		//tv1.setT(new Integer(42));//���� ���� ������?
		
		tv1.setT("LG OLED TV");
		String str = tv1.getT();
		System.out.println("���� TV�� "+str+"������!");
		
		//��ü�� Ÿ������ Integer�� ����
		Tv<Integer> tv2 = new Tv<>();
		
		tv2.setT(42);
		Integer inch = tv2.getT();
		System.out.println("���� TV�� ũ��� "+inch+"������!");
		
		//���Ͱ��� ���׸� �ڵ�� Ÿ�Ժ�ȯ�� �����ϸ鼭, ���α׷� ������ ����Ű��
		//�ƿ﷯, �پ��� Ÿ���� �����Ͽ� ������ �� �ִ� ������ �ִ�. ����, �÷��ǿ�����
		//�������� ����ȭ�� �����ͼ� �ŷڵ��� �����ش�. ���� ����� ���ܰ� �߻��ϴ� �ͺ��ٴ�
		//�����Ͻ� ���ܰ� �߻��ϰ� �ξ� ���α׷������� ������ �Ǵ� ���̴�.		
	}

}
