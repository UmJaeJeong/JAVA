package sec06_exam_define_exception_01;

public class Account {
	private long balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	//���ܾ� ��������
	public long getBalance() {
		return this.balance;
	}
	
	//�Ա��ϱ�
	public void deposit(int money) {
		this.balance = money;
	}
	
	//����ϱ�(���� �Ǵ����� �ϰ� �ִ�)
	public void withdraw(int money) throws BalanceInsfficientExcpetion{
		//�ܰ��� ��ݾ��� ���ٸ� ������ ���� �߻���Ŵ
		if(this.balance <money) 
			throw new BalanceInsfficientExcpetion("�ܰ���� : "+(money-this.balance)+"���ڶ�");
		this.balance-=money;	
	}
}
