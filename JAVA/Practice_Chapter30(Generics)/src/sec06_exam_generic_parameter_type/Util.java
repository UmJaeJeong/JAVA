package sec06_exam_generic_parameter_type;

public class Util {

	//�Ű������� TŸ���� <T extends Number>�� ������ ����
	//NumberŬ�����̰ų� �ڼ�Ŭ������ ����ǵ��� ������ ��.
	public static <T extends Number> int compare(T t1, T t2) {
		//NumberŬ������ doubleValue()�� �߻�޼��带 �̿��c.
		//����������� NumberŬ������ ��ӹ޴� Ŭ���� ��
		//doubleValue()�߻�޼��带 �����Ǹ� �� Ŭ������ �����ϴٰ� ���� �ȴ�.
		
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		//DoubleŬ������ �����޼����� compare()�� �̿�, �뵵�� �𸣸� API�� ����.
		return Double.compare(value1, value2);
	}
}
