package sec01_exam_Casting;

public class CastingExample1 {

	public static void main(String[] args) {
		Car car  = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (Car)fe;���� ����ȯ�� ������ �����̴�.(������)
		//car.water();	//������ ���ܰ� �߻��Ѵ�.? ������? car�� �ٺ��� �����ΰ�?
		fe2 = (FireEngine)car;	//�ڼ�Ÿ�� <- ����Ÿ��
		fe2.water();
	}

}
