package sec08_exam_thread_state;

public class StatePrintThread extends Thread{
	//스레드 상태를 알아보깁 위해 멤버로 TargetThread를 선언하였다.
	private TargetThread targetThread;
	//생성자
	public StatePrintThread(TargetThread targetThread) {
		this.targetThread =targetThread;
	}
	@Override
	public void run() {
		while(true) {
			//TargetThread의 상태정보를 얻는다.
			//TargetThread.State는 Thread클래싀 내부클래스이며, Enum타입이다.
			Thread.State state = targetThread.getState();
			//targetThread가 생성이 되었냐? 되었으면 run()해라
			if(state == Thread.State.NEW)
				targetThread.start();
			//스레드가 종료되었냐?
			if(state == Thread.State.TERMINATED)
				break;//종료되었으면 나가라 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
