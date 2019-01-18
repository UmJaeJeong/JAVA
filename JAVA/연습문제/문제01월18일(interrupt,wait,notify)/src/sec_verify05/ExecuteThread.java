package sec_verify05;

public class ExecuteThread extends Thread {
	private boolean stop;
	int i = 1;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		System.out.println("10초 후 종료합니다.");
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			if(stop) break;
			System.out.println("실행 중 >> i값 변화 : "+i);
		}
		System.out.println("실행종료");
	}

}
