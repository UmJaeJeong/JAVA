package sec_verify04_2;

public class Account {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(1000);
			System.out.println("���� �ܾ� : "+this.balance);
		} catch (InterruptedException e) {
		}
		return this.balance;
	}

	public  void setBalance(int balance) {
		try {
			Thread.sleep(2000);
			this.balance += balance;
			System.out.println(Thread.currentThread().getName()+" ��/�� �Ա� :"+balance+"��");
		} catch (InterruptedException e) {
		}
	}
	
	public void withDraw(int balance) {
		try {
			Thread.sleep(1000);
			if(this.balance-balance>=0) {
				System.out.println(Thread.currentThread().getName()+" ��/�� ��� :"+balance+"��");
				this.balance-=balance;
			}
			else {
				System.out.println("�����ܾ� :"+this.balance+"��");
				System.out.println(Thread.currentThread().getName()+" ��/��"+this.balance+"����  ��� �õ��Ͽ����ϴ�.");
				System.out.println("�ܾ��� �����մϴ�.!");
			}
		} catch (InterruptedException e) {
		}
	}
	
}
