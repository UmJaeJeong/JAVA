package sec_verify07;

public class InterruptExample {

	public static void main(String[] args) {
		DrawThread drawThread =new DrawThread();
		drawThread.start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drawThread.interrupt();
		
	}

}
