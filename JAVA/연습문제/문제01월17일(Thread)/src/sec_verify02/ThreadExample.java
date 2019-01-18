package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Runnable r = new YourThreadRunnable();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
