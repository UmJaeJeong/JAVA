package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		Account ac = new Account();
		WithDrawThread1 t1 = new WithDrawThread1(ac);
		WithDrawThread2 t2 = new WithDrawThread2(ac);
		t1.setName("��Ӵ�");
		t2.setName("�Ƶ�");
		t1.start();
		t2.start();
	}

}
