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
			System.out.println("���� �ܰ�: "+this.balance);

		}else {
			System.out.println("�Ա��Ͻ� �ݾ��� -�̰ų� �鸸���� �ʰ�����!");
			System.out.println("���� �ܰ�: "+this.balance);

		}
	}

}
