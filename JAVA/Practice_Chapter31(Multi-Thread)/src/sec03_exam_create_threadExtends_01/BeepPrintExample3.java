package sec03_exam_create_threadExtends_01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//����� ���� ����Ŭ�����κ��� �����ϴ� ��Ƽ ������ ���
		//����� �̿��� ������ �����.
		Thread thread = new BeepThread();
		thread.start();	//start�ѹ� �Ȱ��� ��Ȱ���� ���� ���ؼ� ������ ���.

		//"��"�̶�� ���ڿ�5�� ���
		for(int i=0; i<5;i++) {
			System.out.println("��");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
