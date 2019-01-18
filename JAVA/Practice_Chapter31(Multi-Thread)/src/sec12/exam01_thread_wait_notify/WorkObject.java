package sec12.exam01_thread_wait_notify;

public class WorkObject {
	
	//synchronizedŰ���带 �ٿ����� ������, ���ܰ� �߻��Ѵ�.
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA()����");
		notify();	//wait(�Ͻ�����)���µ� �����带 ������ ���·� �����.
		try {
			//�ڱ��ڽ��� �Ͻ����� ���°� �ȴ�.
			//(������ ������ ���·� ����)
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB()����");
		notify();	//wait(�Ͻ�����)���µ� �����带 ������ ���·� �����.
		try {
			//�ڱ��ڽ��� �Ͻ����� ���°� �ȴ�.
			//(������ ������ ���·� ����)
			wait();
		} catch (InterruptedException e) {}
	}
	
}
