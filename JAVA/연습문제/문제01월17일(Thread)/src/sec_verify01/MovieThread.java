package sec_verify01;

public class MovieThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0; i<3;i++) {
				Thread.sleep(500);

				System.out.println("�������� ����մϴ�.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
