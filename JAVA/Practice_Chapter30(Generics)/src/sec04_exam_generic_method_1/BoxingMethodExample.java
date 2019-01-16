package sec04_exam_generic_method_1;

public class BoxingMethodExample {

	public static void main(String[] args) {
		//UtilŬ������ boxing()�޼���� �����޼����̸鼭. �ƿ﷯ ���׸� �޼����̴�.
		//�Ͽ� �Ʒ��� ���� Ÿ���� ��������� �Ѵ�. �׷� ������ Ÿ�Կ� ���ؼ� T�� �����Ǿ�����.
		//��ü�� Ÿ�� Integer�̴�. �׷��Ƿ� Integer��ü�� ���;� �Ѵ�.
		//�ƿ﷯ ����Ÿ���� Box<Integer>�� �Ǿ���Ѵ�.
		
		Box<Integer> box = Util.<Integer>boxing(100);
		
		//�̷��� ���� Integer��ü�� �����ؼ� �Ű������� �൵ �ȴ�.
		Box<Integer> box1 = Util.<Integer>boxing(new Integer(100));
		
		//<Integer>�� ��� �ȴ� �����Ϸ��� �˾Ƽ� �Ű������� ���� Ÿ���� ���߸� �Ѵ�.
		//�� ����� ��κ� ����. �ƿ﷯ �ڽ�(Wrapping)�� �ȴ�.
		Box<Integer> box2 = Util.boxing(100);
		//Util.<Integer>boxing("ȫ�浿");//������ ����. ������?4
		
		int intVaule = box2.getT();
		System.out.println("Box<>Integer box2 ��ü���� ���� �� :"+intVaule);
		
		Box<String> box3 = Util.boxing("ȫ�浿");
		//Box<String> box3 = Util.<String> boxing("ȫ�浵"); gownjeh ehla
		String strValue = box3.getT();
		System.out.println("Box<>Integer box3 ��ü���� ���� �� :"+strValue);
		
	}

}
