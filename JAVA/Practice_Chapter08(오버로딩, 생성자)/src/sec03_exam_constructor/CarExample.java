package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		//���� �ֹ��ؼ� �ڱⰡ ���� ���� �ٸ���, �� �����,
		//���� 4�� �� �����
		Car c1 = new Car();
		/*
		 * c1.color = "withe";
		 * c1.gearType = "auto";
		 * c1.door = 4;
;		 */
		
		//���� �ֹ��� �� ����, ���, �������� �������ִ� ����
		Car c2 = new Car("���","auto",6);  //�Ű������� 3���� ������ ȣ��
		
		//toString�޼��尡 ȣ���;
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
