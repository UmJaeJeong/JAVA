package sec_verify11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		Callable<Integer> callable =new SumThread();
		
		Future<Integer> future = executorService.submit(callable);
		try {
			Object obj;
			obj = future.get();
			Integer in = (Integer)obj;
			System.out.println("[작업처리 결과] : "+in);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Future<?> future = executorService.submit(runnable);
	}

}
