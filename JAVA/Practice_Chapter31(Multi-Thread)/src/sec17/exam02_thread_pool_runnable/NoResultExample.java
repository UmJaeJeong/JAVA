package sec17.exam02_thread_pool_runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		//해당 PC CPU의 코어수를 최대 스레드 수로 준다(ex. 듀얼코어는 2, 쿼드코어는 4이다.)
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("내 컴퓨터 코어 수 : "+ Runtime.getRuntime().availableProcessors());
		//Runnable익명 구현객체 생성(작업객체) --> 리턴값이 없다.
		System.out.println("[작업처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10;i++) {
					sum+=i;
				}
				System.out.println(Thread.currentThread().getName());

				System.out.println("[작업 처리 결과] : "+sum);

				
			}
		};
		Thread thread = new Thread(runnable);
		//thread.setName("what's up?");
		thread.start();
		//작업큐에 작업을 넣는다. 리턴값이 없다. 하여 Future<?> submit(Runnable task)를 선택한다.
		//작업이 완료될때까지 블로킹 즉 기다린다. Future은 지연완료객체이다.
		Future<?> future = executorService.submit(runnable);
		
		try {
			Object obj;
			obj = future.get();
			String str = (String)obj;
			System.out.println("[작업처리 완료]");
			System.out.println();
		} catch (InterruptedException | ExecutionException e) {
		}
		executorService.shutdown();//스레드풀 종료
		
	}

}
