package sec_verify07;

public class DrawThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("�׸� �׸��� ��");
			if(Thread.interrupted()) {
				System.out.println("interrupt()ȣ�� ��");
				break;
			}
		}
		System.out.println("������ �ڿ� ����");
		System.out.println("������ ����");
	}
}
