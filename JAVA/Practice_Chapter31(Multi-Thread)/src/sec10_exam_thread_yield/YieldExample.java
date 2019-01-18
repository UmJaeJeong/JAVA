package sec10_exam_thread_yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//우선순위가 같거나 높을때만 yield()를 작용하게끔 되었으나,
		//딱히 그런것 같지는 않아보인다.
		//threadB.setPriority(1);
		//3초 동안은 번갈아 실행하다가 이후, ThreadD를 yield() 호출함으로써,
		//ThreadB만 실행하게된다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		
		threadA.work = false;
		
		//다시3초후 , ThreadB가 yield()호출함으로써 ThreadA만 실행된다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		threadA.work = true;
		threadB.work = false;
		//3초후 ThreadA와  Thread가 종료하게 된다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		threadA.stop = true;
		threadB.stop = true;
	}
		
}
