package sec_verify05;

public class StudentAnonymous {
	Student field = new Student("������") {
		 
		@Override
		public void wake() {
			System.out.println("�ʵ�(�������)�� �ʱⰪ���� ������ �ڽİ�ü");
			super.wake();
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			goSchool();
		}
		
		public void goSchool() {
			System.out.println(this.name+"�� ��մϴ�.");
		}
	};
	
	void method1() {
		Student field = new Student("���ѱ�") {
			 
			@Override
			public void wake() {
				System.out.println("���ú����� �ʱⰪ���� ������ �ڽ� ��ü");
				super.wake();
				System.out.println("9�ÿ� �Ͼ�ϴ�.");
				goMoving();
			}
			
			public void goMoving() {
				System.out.println(this.name+"�� ��ȭ�� ���� ���ϴ�.");
			}
		};
		field.wake();
	}
	
	void method2(Student student) {
		student.wake();
		
	}
}
