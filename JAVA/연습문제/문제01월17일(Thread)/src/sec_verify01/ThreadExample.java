package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		Runnable r = new RecordingRunnable();
		Thread thread_r = new Thread(r);
		MovieThread thread_m = new MovieThread();
		thread_m.start();
		thread_r.start();
	}

}
