package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {
		Toilet to = new Toilet();
		ToiletUsingThread t1 = new ToiletUsingThread(to,"아버지");
		ToiletUsingThread t2 = new ToiletUsingThread(to,"아들");
		ToiletUsingThread t3 = new ToiletUsingThread(to,"딸");
		ToiletUsingThread t4 = new ToiletUsingThread(to,"어머니");
		t1.setName("아버지");
		t2.setName("아들");
		t3.setName("딸");
		t4.setName("어머니");

		t1.start();
		t2.start();
		t3.start();
		t4.start();



	}

}
