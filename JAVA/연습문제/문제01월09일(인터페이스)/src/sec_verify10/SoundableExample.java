package sec_verify10;

public class SoundableExample {

	public static void main(String[] args) {
		Soundable s = new Soundable() {
			public void sound() {
			System.out.println("ù��° �͸�����ü :����");
			 System.out.println("���� ���� ����ϴ�.");
			}
		};
		
		Soundable s1 = new Soundable() {
			public void sound() {
				System.out.println("�ι�° �͸�����ü :��������");
			 System.out.println("���������� ������ �մϴ�.");
			}
		};
		s.sound();
		s1.sound();
	}

}
