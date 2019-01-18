package sec_verify01;

public class MovieThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0; i<3;i++) {
				Thread.sleep(500);

				System.out.println("동영상을 재생합니다.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
