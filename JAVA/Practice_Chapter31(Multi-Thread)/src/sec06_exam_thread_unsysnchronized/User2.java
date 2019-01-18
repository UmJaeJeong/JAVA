package sec06_exam_thread_unsysnchronized;

public class User2 extends Thread
{
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.cal = cal;
		this.setName("User-2");

	}
	
	@Override
	public void run() {
		//공유객체의 필드인 memory값을 50으로 설정하고 있다.
		this.cal.setMemory(50);
	}
}
