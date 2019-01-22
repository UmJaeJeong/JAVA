package sec17.exam03_thread_pool_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		//�ش� PC CPU�� �ھ���� �ִ� ������ ���� �ش�. (ex.����ھ�� 2, �����ھ�� 4�̴�.)
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		//Callable�͸� ������ü ����(�۾���ü) --> ���ϰ��� <T>Ÿ������ �����Ѵ�.
		//���, ���ϰ��� <T>Ÿ�԰� �����ؾ��Ѵ�.
		System.out.println("[�۾�ó�� ��û]");
		
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1;i<=10;i++) sum+=i;
				
				return sum;
			}
		};
		/*
		 * �۾�ť�� �۾��� �ִ´�.
		 * ���ϰ��� <T>. �Ͽ� Futuer<T> submit<Callable tast>�� �����Ѵ�.
		 * �۾��� �Ϸ�ɋ����� ���ŷ �� ��ٸ���. Future�� �����Ϸᰴü�̴�.
		 * Future���� <T>Ÿ������ �����ؾ� �Ѵ�.
		 */
		Future<Integer> future =executorService.submit(callable);
		int value;
		try {
			value = future.get();	//get()�� �۾���ü�� �۾��� �Ϸ��� ������ ��ٸ���.(���ŷ)
			System.out.println("[�۾�ó�� ���] : "+value);
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();//������Ǯ ����
		
		}

}
