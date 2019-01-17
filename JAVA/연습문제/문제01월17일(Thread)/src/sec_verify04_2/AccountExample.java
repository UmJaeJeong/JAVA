package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		Account ac = new Account();
		WithDrawThread1 t1 = new WithDrawThread1(ac);
		WithDrawThread2 t2 = new WithDrawThread2(ac);
		t1.setName("어머니");
		t2.setName("아들");
		t1.start();
		t2.start();
	}

}
