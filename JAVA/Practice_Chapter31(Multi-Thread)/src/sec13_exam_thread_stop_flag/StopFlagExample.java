package sec13_exam_thread_stop_flag;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread printthread = new PrintThread();
		printthread.start();
		
		//���ν����� 1�� ������ PrintThread�� stop�÷��׷� �������� ������
		//������ ���������� �����带 �����Ҷ� �����带 �Ͻ����� ���·� ����
		//�����ϴ� ����� ������ �ʴ´�.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
		printthread.setstop(true);
	}

}
