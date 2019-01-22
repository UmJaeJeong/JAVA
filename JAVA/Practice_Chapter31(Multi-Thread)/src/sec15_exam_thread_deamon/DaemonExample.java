package sec15_exam_thread_deamon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//daemon설정(필히 start()호출전에 설정을 해야한다.
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		if(autoSaveThread.isDaemon())
			System.out.println("autoSaveThread는 데몬스레드입니다.");

		//메인스레드가 5초동안 정지하면, daemon스레드인 autoSaveThread가
		//실행되고 메인스레드가 종료되면 더 이상 autoSaveThread가 실행이
		//안된다는 것을 알 수가 있다.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		//autoSaveThread.interrupt();
		System.out.println("메인스레드 종료됨");
	}

}
