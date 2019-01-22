package sec_verify09;

public class UnitThread extends Thread {
	public UnitThread(ThreadGroup threadGroup, String name ) {
		super(threadGroup,name);
	}
	@Override
	public void run() {
		ThreadGroup mainGroup  = Thread.currentThread().getThreadGroup();
		System.out.println("현재 실행 중인 스레드명 : "+Thread.currentThread().getName()+"\t스레드그룹명 : "+mainGroup.getName()+"\t부모그룹명 : "+mainGroup.getParent().getName());
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+"  interrupted!!");
				break;
			}

		}
		System.out.println(this.getName()+"종료됨");


	}
}
