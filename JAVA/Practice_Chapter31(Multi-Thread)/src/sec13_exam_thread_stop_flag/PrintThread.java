package sec13_exam_thread_stop_flag;

public class PrintThread extends Thread{
	private boolean stop;//flag�÷��� ����(�⺻�� : false)
	
	public void setstop(boolean stop) {
		this.stop =stop;
	}
	
	@Override
	public void run() {
		//�ܺο��� stop�� true�� �����ϸ� �������� ���´�.
		while(!stop) {
			System.out.println("���� ��");
		}
		
		System.out.println("�˱��� �ڿ� �����Ϸ�");
		System.out.println("��������");
	}
}
