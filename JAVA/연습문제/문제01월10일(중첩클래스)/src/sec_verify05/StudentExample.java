package sec_verify05;

public class StudentExample {

	public static void main(String[] args) {
		StudentAnonymous sa = new StudentAnonymous();
		
		System.out.println("====================");
		sa.field.wake();
		System.out.println("====================");
		sa.method1();
		System.out.println("====================");
		
		sa.method2(new Student("�迬��") {
			@Override
			public void wake() {
				System.out.println("�Ű������� �Ű������� �͸��ڼհ�ü�� ����");
				super.wake();
				System.out.println("�� 4�ÿ� �Ͼ�ϴ�.");
				Study();
			}
			public void Study() {
				System.out.println(this.name+"�� �����մϴ�.");
			}
		});
		System.out.println("====================");

		
	}

}
