package sec06_exam_thread_unsysnchronized;

public class User1 extends Thread {
	private Calculator cal;

	public void setCalculator(Calculator cal) {
		this.cal = cal;
		this.setName("User-1");
	}
	
	@Override
	public void run() {
		//������ü�� �ʵ��� memory���� 100���� �����ϰ� �ִ�.
		this.cal.setMemory(100);
	}
}
