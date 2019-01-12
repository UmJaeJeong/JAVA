package sec05_exam_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous am = new Anonymous();
		//�͸��ڽİ�ü���� ������ �� wake�� ȣ��ȴ�.
		am.field.wake();
		//�޼��� ȣ��� ���ÿ� ���ú����� �͸��ڽİ�ü �����Ǿ� �����ȴ�.
		am.method();

		//�Ű������� �͸��ڽİ�ü�� �����ؼ� ȣ���ϰ� �ִ�.
		am.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("13�ÿ� �Ͼ�ϴ�.");
				this.study();
			}
		});
	}

}
