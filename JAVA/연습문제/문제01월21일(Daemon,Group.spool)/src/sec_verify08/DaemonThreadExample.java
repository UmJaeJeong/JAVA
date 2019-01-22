package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		DateTimeThread t1 = new DateTimeThread();
		t1.setDaemon(true);
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
		}
		t1.interrupt();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
		System.out.println("main 스레드가 종료됩니다.");
	}

}
