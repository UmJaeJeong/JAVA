package sec01_exam_Casting;

public class CastingExample2 {

	public static void main(String[] args) {
		//Car car = new Car();//�ν��Ͻ� ����
		Car car = new FireEngine();
		//Car car = null;	//Car�ν��Ͻ� ����
		
		//������ : ����Ÿ���� ���������� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ�� �ִ�.
		//(�������� ��� ���� -> �������� ����),�ݴ�� �Ұ���
		//Car car = new FireEngin(); //�̷������� ������
		
		
		//Car2�� null�ʱ�ȭ
		Car car2 = null;
		FireEngine fe = new FireEngine();
		
		//Car�� drive()�޼��� ȣ��
		car.drive();
		//�ڼ�Ÿ���� �ν��Ͻ��� ������ ����Ÿ���� �ν��Ͻ��� �ٷ�� ����.
		//(�������� ����� ���� -> �������� �Ұ�),
		//�ݴ�� ���
		//car = fe; 
		fe = (FireEngine)car;	//�������� OK, ����� ������ �߻�(ClassCastException�߻�)
								//
		fe.drive();
		car2 = fe;
		car2.drive();
		fe.water();
	}

}
