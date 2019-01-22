package sec_verify09;

public class UnitThread extends Thread {
	public UnitThread(ThreadGroup threadGroup, String name ) {
		super(threadGroup,name);
	}
	@Override
	public void run() {
		ThreadGroup mainGroup  = Thread.currentThread().getThreadGroup();
		System.out.println("���� ���� ���� ������� : "+Thread.currentThread().getName()+"\t������׷�� : "+mainGroup.getName()+"\t�θ�׷�� : "+mainGroup.getParent().getName());
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+"  interrupted!!");
				break;
			}

		}
		System.out.println(this.getName()+"�����");


	}
}
