package sec_verify05;

public class ExecuteThread extends Thread {
	private boolean stop;
	int i = 1;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		System.out.println("10�� �� �����մϴ�.");
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			if(stop) break;
			System.out.println("���� �� >> i�� ��ȭ : "+i);
		}
		System.out.println("��������");
	}

}
