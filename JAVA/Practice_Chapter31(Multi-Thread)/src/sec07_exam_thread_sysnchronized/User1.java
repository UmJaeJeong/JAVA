package sec07_exam_thread_sysnchronized;

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
