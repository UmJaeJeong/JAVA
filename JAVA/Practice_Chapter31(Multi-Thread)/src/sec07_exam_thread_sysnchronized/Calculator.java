package sec07_exam_thread_sysnchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return this.memory;
	}
	
	//����ȭ �޼���,Ȯ���� ������ü�� �����ϱ� ���ؼ� user1�� ���� �����ϰ� ������
	//user2�� �����ϹǷ� �ӵ��� ��������. ������ �������� �ŷڼ��� �����Ѵ�.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		// 2�� �Ͻ�����(TIMED_WAITING)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		// ���� �������� ������ �̸��� memory���� ���
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);

	}

}
