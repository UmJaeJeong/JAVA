package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {
		Toilet to = new Toilet();
		ToiletUsingThread t1 = new ToiletUsingThread(to,"�ƹ���");
		ToiletUsingThread t2 = new ToiletUsingThread(to,"�Ƶ�");
		ToiletUsingThread t3 = new ToiletUsingThread(to,"��");
		ToiletUsingThread t4 = new ToiletUsingThread(to,"��Ӵ�");
		t1.setName("�ƹ���");
		t2.setName("�Ƶ�");
		t3.setName("��");
		t4.setName("��Ӵ�");

		t1.start();
		t2.start();
		t3.start();
		t4.start();



	}

}
