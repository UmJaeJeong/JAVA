package sec03_exam_create_threadExtends_02;

public class Timerthread extends Thread{
	@Override
	public void run() {
		for(int i=10; i<0;i--) {
			System.out.println("남은시간 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
		
		}
	}
}
