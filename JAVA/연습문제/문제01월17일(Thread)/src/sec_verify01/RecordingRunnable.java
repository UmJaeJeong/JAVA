package sec_verify01;

public class RecordingRunnable implements Runnable {

	@Override
	public void run() {
		try {

			for (int i = 0; i < 2; i++) {
				System.out.println("��ȭ�� �����մϴ�.");
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
