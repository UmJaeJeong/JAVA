package sec12.exam01_thread_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {

		WorkObject shareworkObject = new WorkObject();
		ThreadA threadA = new ThreadA(shareworkObject);
		ThreadB threadB = new ThreadB(shareworkObject);
		
		//�����ڵ忡 ���� notify()�� wait()�� ȣ���ϰ� ����ȭ �޼���� �Ǿ� �־�
		//������ ����Ǵ� ���� �� �� �ִ�.
		threadA.start();
		threadB.start();
		
		//�ٽ� �ѹ� ����������, wait(), notify(), notifyAll()�� ObjectŬ������
		//�޼����̸�, ���� ����ȭ(synchronized) �޼���� ����ȭ �������� ��밡���ϴٴ�
		//���� ���� ���� �ʵ��� ����.
	}

}
