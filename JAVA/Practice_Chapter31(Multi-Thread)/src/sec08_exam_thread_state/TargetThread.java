package sec08_exam_thread_state;

public class TargetThread extends Thread{
	@Override
	public void run() {
		//20��� ����, ���� �����̰ų� ���� ���(RUNNABLE)�����̴�
		for(long i =0;i<200000000;i++) {
			System.out.println("?");
			//�Ͻ�����(TIMED_WAITING)����
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			
		}
		//20��� ����, ���� �����̰ų� ���� ���(RUNNABLE)�����̴�.
		for(long i=0; i<200000000;i++) {}
	}//����(TERMINATED)

}
