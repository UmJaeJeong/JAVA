package sec02_exam;

public class ReferenceReturnClass {

	public static void main(String[] args) {
		Data d= new Data();
		d.x = 10;
		
		//�������� d�� �Ű������� ������. �ƿ﷯ ��ȯ���� DataŸ������ �޴´�.
		Data d2 = ReferenceReturnClass.copy(d);
		
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		System.out.println("d2�ּ� = "+d);
		System.out.println("d2�ּ� = "+d2);

	}
	public static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		System.out.println("temp�ּ� = "+temp);
		return temp;

	}

}
