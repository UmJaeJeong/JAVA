package sec_verify05;

public class StopFlagExample {
	public static void main(String[] args) {
		ExecuteThread executeThread = new ExecuteThread();
		executeThread.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executeThread.setStop(true);
		
	}
	
}
