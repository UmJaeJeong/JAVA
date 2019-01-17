package sec_verify04_2;

public class WithDrawThread2 extends Thread {
	private Account account;
	
	public WithDrawThread2(Account account) {
		setAccount(account);
	}
	
	public void setAccount(Account account ) {
		this.account = account;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2500);
			this.account.withDraw(300);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
