package sec03_exam_Nested_Outter_Refer;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter(); //�ٱ�Ŭ���� �ν��Ͻ� ����
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
