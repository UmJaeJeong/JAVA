package sec_verify03;

public class BombThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			throw new InterruptedException();
		} catch (InterruptedException e) {
			System.out.println("ÆøÅºÀÌ ÅÍÁ³³×¿ä!²Î~!!!");
		}
	}
}
