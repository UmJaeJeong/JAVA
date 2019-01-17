package sec_verify04_2;

public class WithDrawThread1 extends Thread {
	private Account account;
	
	public WithDrawThread1(Account account) {
		setAccount(account);
	}
	public void setAccount(Account account ) {
		this.account = account;
	}
	
	@Override
	public void run() {
		this.account.setBalance(1000);
		this.account.withDraw(500);
		this.account.withDraw(300);


	}
}
