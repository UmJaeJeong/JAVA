package sec06_exam_thread_unsysnchronized;

public class Calculator {
private int memory;

public int getMemory() {
	return this.memory;
}

public void setMemory(int memory) {
	this.memory =memory;
	//2�� �Ͻ�����(TIMED_WAITING)
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	//���� �������� ������ �̸��� memory���� ���
	System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	
}

}
