package sec15_exam_thread_deamon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//daemon����(���� start()ȣ������ ������ �ؾ��Ѵ�.
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		if(autoSaveThread.isDaemon())
			System.out.println("autoSaveThread�� ���󽺷����Դϴ�.");

		//���ν����尡 5�ʵ��� �����ϸ�, daemon�������� autoSaveThread��
		//����ǰ� ���ν����尡 ����Ǹ� �� �̻� autoSaveThread�� ������
		//�ȵȴٴ� ���� �� ���� �ִ�.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		//autoSaveThread.interrupt();
		System.out.println("���ν����� �����");
	}

}
