package sec06_exam_generic_parameter_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//int result = Util.compare(("ȫ�浿", "�赿��");					//�������� ������? NumberŬ���� ������ �ڽĵ鸸 ���� ���ִ�.
		//int result2 = Util.<Integer>compare(100.1,200); 					//�������� ������? <Integer>�̶�� �Դ´� Double���� ���Ե�.
		//int result3 = Util.compare(new Object(), new Object());			//�������� ������? Obejct�� ����Ŭ�����̹Ƿ� ����´�.
		//int result5 = Util.<Integer>compare(new Number(), new Number());	//�������� ������? NumberŬ������ �߻�Ŭ�����̹Ƿ� ��ü�� �����Ҽ� ����.
		
		//���� ��ü�� �����ؼ� �ѱ�� �������� �׳� ���ڰ� ������ �ڵ� �ڽ��� �ȴ�.
		int result = Util.compare(100, 200);
		System.out.println(result);
		result = Util.compare(new Integer(100), new Integer(200));
		System.out.println(result);
		result = Util.compare(new Double(200), new Double(400.77));
		System.out.println(result);
		result = Util.compare(4.5, 1);		
		System.out.println(result);
		result = Util.compare(4.5, 4.5);
	}

}
