package sec01_exam;

public class FieldInitValueExample{

	public static void main(String[] args) {
		FieldInitValue field = new FieldInitValue();
		
		
		System.out.println("�⺻�� ����");
		System.out.println("byteField: ");
		System.out.println("shortField: "+field.byteField);
		System.out.println("intField: "+field.intField);
		System.out.println("longField: "+field.longField);
		System.out.println("longField: "+field.booleanField);

		//charŸ���� ���� ����.
		System.out.println("charField: "+field.charField);
		System.out.println("floatField: "+field.floatField);
		System.out.println("doubleField: "+field.doubleField);
		System.out.println();
		System.out.println("������ ����");
		System.out.println("arrField: "+field.arrField);
		System.out.println("referenceField: "+field.referenceField);
		
		/*
		 * �ν��Ͻ� ������ ����� �ϸ�, �ν��Ͻ��� �ּҰ� ��µ�
		 * Object�� ��ӹޱ� ������ ��¹��� ���������� ������ �� objectŬ������
		 * toString()�ڵ� ȣ���. ������, ������ �������̵�(������)�� toStirng()�� ȣ��ȴ�.
		 * 
		 */
		System.out.println("Class referenceValiable : "+field.toString());









		
	}
	
	
	

}
