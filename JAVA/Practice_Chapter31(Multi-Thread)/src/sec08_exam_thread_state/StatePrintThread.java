package sec08_exam_thread_state;

public class StatePrintThread extends Thread{
	//������ ���¸� �˾ƺ��� ���� ����� TargetThread�� �����Ͽ���.
	private TargetThread targetThread;
	//������
	public StatePrintThread(TargetThread targetThread) {
		this.targetThread =targetThread;
	}
	@Override
	public void run() {
		while(true) {
			//TargetThread�� ���������� ��´�.
			//TargetThread.State�� ThreadŬ���� ����Ŭ�����̸�, EnumŸ���̴�.
			Thread.State state = targetThread.getState();
			//targetThread�� ������ �Ǿ���? �Ǿ����� run()�ض�
			if(state == Thread.State.NEW)
				targetThread.start();
			//�����尡 ����Ǿ���?
			if(state == Thread.State.TERMINATED)
				break;//����Ǿ����� ������ 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
