package sec03_exam_Nested_Outter_Refer;

public class Outter {
	//�ܺ�Ŭ���� �������
	String field = "Outter_field";
	
	//�ܺ�Ŭ����
	public void method() {
		System.out.println("�ٱ� Ŭ���� �޼��� ȣ��");
	}
	
	class Nested{
		//����Ŭ���� ��� ����
		String field = "Inner_field";
		//����Ŭ���� �޼���
		public void method() {
			System.out.println("���� Ŭ���� �޼��� ȣ��");
		}
		
		//����Ŭ���� �޼���
		public void print() {
			//���⼭�� this�� ����Ŭ������ �ڽ��� �ǹ�
			System.out.println(this.field);
			this.method();
			//�ٱ�Ŭ���� ����� ���� ����� ��Ÿ��.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
