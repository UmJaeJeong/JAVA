package sec01_exam;

public class FieldInitValue{

		//���������� �ϰ�, �ʵ��� ��.
		byte byteField;//1
		short shortField;//2
		int intField;//4
		long longField;//8
		
		boolean booleanField;//1
		char charField;//2(�����ڵ�)1(�ƽ�Ű�ڵ�)
		
		float floatField;
		double doubleField;
		//����������
		int[] arrField;//4
		String referenceField;//4
		
		//FieldInitValue field = new FieldInitValue();
		//System.out.println(field);
		
	
	//toStirng()�� ������ �������(�ʵ�)�� ������ ���÷� Ȯ���ϰ��� �Ҷ���,
	//�ڽ��� ���Ĵ�� ����� ���Ҷ� toString()�������̵��� �Ѵ�.
	
	@Override//unotation -> �����Ϸ����� ��! ���� �̰� ������ �س����ϱ� �ȹٷκ� ������!
	public String toString() {
		// TODO Auto-generated method stub
		return "String";
	}

}
