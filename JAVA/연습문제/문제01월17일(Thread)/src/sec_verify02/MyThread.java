package sec_verify02;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("MyThread");
				if(i==2)
				Thread.sleep(3000);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
