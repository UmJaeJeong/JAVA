package sec17.exam01_thread_submit_execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample {

	public static void main(String[] args) {
		//최대 2개의 스레드를 가지는 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);	//스레드를 재사용한다.
		for(int i=0; i<20;i++) {
			//20개의 작업객체 생성
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//newFixedThreadPool과 newCachedThreadPool은 내부적으로 ThreadPoolExecutor로
					//만들어 졌기 떄문에 타입변환으로 ThreadPoolExecutor 객체를 얻을 수 있다.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					//현재 스레드풀에 있는 스레드 개수를 리턴하여 얻을수 있다.
					int poolSize = threadPoolExecutor.getPoolSize();
					
					//작업실행하는 스레드명을 얻는다.
					String threadName = Thread.currentThread().getName();
					//System.out.println("작업 처리 -"+threadName);
					System.out.println("[총 스레드개수"+poolSize+"] 작업스레드 이름 : "+threadName);
					
					//일부러 예외를 발생시켜서 execute()와 submit의 차이를 보자
					//try {
						int value =10/0;
						//System.out.println("try");
						
					//}catch(Exception e) {
						//System.out.println("catch");
					//}
				}
			};
			//작업큐에 runnable객체를 넣는 행위, execute() 작업 처리 도중에 예외가 발생하면,
			//해달 스레드를 제거하고 새로운 스레드를 생성한다. submit()는 예외가 발생하더라도,
			//해당 스레드를 제거하지 않고 재사용을 한다. 하여, submit()을 사용하는 것이 좋다.
			//직접 확인해보자
			//executorServaice.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
			
		}
		//스레드풀을 종료시킴(단, 작업큐에 있는 모든 작업을 처리한 후에 스레드 풀을 종료시킨다.)
		executorService.shutdown();
	}

}
