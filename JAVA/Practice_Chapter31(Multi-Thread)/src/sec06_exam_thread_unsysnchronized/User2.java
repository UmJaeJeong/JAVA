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
		//������ü�� �ʵ��� memory���� 50���� �����ϰ� �ִ�.
		this.cal.setMemory(50);
	}
}
