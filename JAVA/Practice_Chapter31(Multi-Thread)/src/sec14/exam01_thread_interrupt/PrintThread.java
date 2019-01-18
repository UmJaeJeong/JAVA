package sec14.exam01_thread_interrupt;

public class PrintThread extends Thread{
	@Override
	public void run() {
		//�Ʒ��� �Ϻη� �Ͻ����� ���·� ������̴�. ���������� �̷� �ڵ��� ����.
		//�Ͻ����� ���¸� ������ �ʰ� �����Ű�� ���� ���δ�.
		try {
			System.out.println("���� ��");
			Thread.sleep(1);		//�Ͻ�����(interrupt()�� ȣ��Ǹ� ���� �߻�)
		} catch (InterruptedException e) {
			System.out.println("���� �߻�");
			System.out.println("interrupt()ȣ���");
			
		}
		
		System.out.println("������ �ڿ� ����");
		System.out.println("������ ����");
	}
	/*
	 * ����������� �������� �ݺ����� �����ϱ� ���ؼ��� ���� ���� ����� interrupt()�� �̿��ϴ�
	 * ���� ���� �̻����̴�. �Ͻ������� �ְ� ���� ���� �������� ����� �����ϴ� ��� �� ���� �θ� �̿�ȴ�.
	 */
}
