package sec16.exam02_thread_group;

public class WorkThread extends Thread{
	//������(����Ŭ���� �׷�, �ڽ��� �������̸�)
	public WorkThread(ThreadGroup threadgroup, String threadName) {
		super(threadgroup, threadName);	//����(�θ�)Ŭ���� ������ ȣ��
	}
	
	@Override
	public void run() {
		//���� ����ǰ� �ִ½����� �׷��� ����
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("������� : "+Thread.currentThread().getName()+ ", ������ �׷�� : "+str);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+" interrupted!");
				break;
			}
		}
		
		System.out.println(this.getName()+"�����!!!");
	}
}
