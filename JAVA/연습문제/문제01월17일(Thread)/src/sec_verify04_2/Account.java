package sec_verify04_2;

public class Account {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(1000);
			System.out.println("통장 잔액 : "+this.balance);
		} catch (InterruptedException e) {
		}
		return this.balance;
	}

	public  void setBalance(int balance) {
		try {
			Thread.sleep(2000);
			this.balance += balance;
			System.out.println(Thread.currentThread().getName()+" 이/가 입금 :"+balance+"원");
		} catch (InterruptedException e) {
		}
	}
	
	public void withDraw(int balance) {
		try {
			Thread.sleep(1000);
			if(this.balance-balance>=0) {
				System.out.println(Thread.currentThread().getName()+" 이/가 출금 :"+balance+"원");
				this.balance-=balance;
			}
			else {
				System.out.println("통장잔액 :"+this.balance+"원");
				System.out.println(Thread.currentThread().getName()+" 이/가"+this.balance+"원을  출금 시도하였습니다.");
				System.out.println("잔액이 부족합니다.!");
			}
		} catch (InterruptedException e) {
		}
	}
	
}
