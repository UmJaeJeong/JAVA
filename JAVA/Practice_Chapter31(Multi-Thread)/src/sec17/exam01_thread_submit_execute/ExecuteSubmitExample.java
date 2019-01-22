package sec17.exam01_thread_submit_execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample {

	public static void main(String[] args) {
		//�ִ� 2���� �����带 ������ ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);	//�����带 �����Ѵ�.
		for(int i=0; i<20;i++) {
			//20���� �۾���ü ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//newFixedThreadPool�� newCachedThreadPool�� ���������� ThreadPoolExecutor��
					//����� ���� ������ Ÿ�Ժ�ȯ���� ThreadPoolExecutor ��ü�� ���� �� �ִ�.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					//���� ������Ǯ�� �ִ� ������ ������ �����Ͽ� ������ �ִ�.
					int poolSize = threadPoolExecutor.getPoolSize();
					
					//�۾������ϴ� ��������� ��´�.
					String threadName = Thread.currentThread().getName();
					//System.out.println("�۾� ó�� -"+threadName);
					System.out.println("[�� �����尳��"+poolSize+"] �۾������� �̸� : "+threadName);
					
					//�Ϻη� ���ܸ� �߻����Ѽ� execute()�� submit�� ���̸� ����
					//try {
						int value =10/0;
						//System.out.println("try");
						
					//}catch(Exception e) {
						//System.out.println("catch");
					//}
				}
			};
			//�۾�ť�� runnable��ü�� �ִ� ����, execute() �۾� ó�� ���߿� ���ܰ� �߻��ϸ�,
			//�ش� �����带 �����ϰ� ���ο� �����带 �����Ѵ�. submit()�� ���ܰ� �߻��ϴ���,
			//�ش� �����带 �������� �ʰ� ������ �Ѵ�. �Ͽ�, submit()�� ����ϴ� ���� ����.
			//���� Ȯ���غ���
			//executorServaice.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
			
		}
		//������Ǯ�� �����Ŵ(��, �۾�ť�� �ִ� ��� �۾��� ó���� �Ŀ� ������ Ǯ�� �����Ų��.)
		executorService.shutdown();
	}

}
