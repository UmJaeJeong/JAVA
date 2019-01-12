package sec06_exam_define_exception_01;

//사용자 정의 예외클래스
public class BalanceInsfficientExcpetion extends Exception{
	
	//기본 생성자
	public BalanceInsfficientExcpetion() {}
	
	//생성자
	public BalanceInsfficientExcpetion(String message) {
		super(message);//조상의 생성자 호출
	}

}
