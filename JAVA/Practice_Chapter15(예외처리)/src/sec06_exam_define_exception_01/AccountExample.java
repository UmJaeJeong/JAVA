package sec06_exam_define_exception_01;

public class AccountExample {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.deposit(10000);
		System.out.println("예금액 : "+ac.getBalance());
		
		//출금하기
		try {
			ac.withdraw(30000);
			System.out.println("출금이 되었습니다.");
			System.out.println("현잔액 : "+ac.getBalance());
		} catch (BalanceInsfficientExcpetion e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			//개발할때 사용한다. 개발완료시 주석처리를 하던지 삭제를 하는 것이 바람직하다.
			e.printStackTrace();
			//System.out.println(e.toString());//간단히 디버깅 할때 사용
		}
		
		
	}

}
