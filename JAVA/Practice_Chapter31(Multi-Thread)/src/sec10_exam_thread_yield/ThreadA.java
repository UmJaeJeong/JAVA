package sec10_exam_thread_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				//�ʹ� ���� �����ϴϱ� �����غ�
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {}
				System.out.println("ThreadA �۾� ����");
			}else {
				//���ǹ��� �ݺ��� ���� ���� �ٸ� ���������� �纸��
				//(���� �켱������ �� �̻��� ����������)
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
