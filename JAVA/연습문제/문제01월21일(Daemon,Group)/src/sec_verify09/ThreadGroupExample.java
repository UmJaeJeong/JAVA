package sec_verify09;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup mainGroup  = Thread.currentThread().getThreadGroup();
		System.out.println("현재 실행 중인 스레드명 : "+Thread.currentThread().getName()+"\t스레드그룹명 : "+mainGroup.getName()+"\t부모그룹명 : "+mainGroup.getParent().getName());
		ThreadGroup AGroup = new ThreadGroup("AGroup");
		ThreadGroup BGroup = new ThreadGroup("BGroup");

		ThreadGroup A_SubGroup = new ThreadGroup("A_SubGroup");

		UnitThread thread_a = new UnitThread(AGroup,"AGroup_Thread1");
		UnitThread thread_b = new UnitThread(BGroup,"BGroup_Thread1");
		UnitThread thread_c = new UnitThread(A_SubGroup,"A_SubGroupThread1");
		UnitThread thread_d = new UnitThread(A_SubGroup,"A_SubGroupThread2");
		
		thread_a.start();
		
		thread_b.start();
		thread_c.start();
		thread_d.start();
		try {
			Thread.sleep(1000);
			System.out.println();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		A_SubGroup.interrupt();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AGroup.interrupt();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BGroup.interrupt();
		
		

	

		
	}

}
