package sec1_verify09;

public class Account {
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	int balance;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		if(balance<=MAX_BALANCE&& balance>=0) {
			this.balance += balance;
			System.out.println("현재 잔고: "+this.balance);

		}else {
			System.out.println("입금하신 금액이 -이거나 백만원을 초과했음!");
			System.out.println("현재 잔고: "+this.balance);

		}
	}

}
