package sec12.exam02_thread_wait_notify;

public class ConsumerThread extends Thread{
	//������ü DataBox
	private DataBox dataBox;
	
	//������
	public ConsumerThread(DataBox dataBox) {
		this.setName("COnsumerThread");//������ �̸�����
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3;i++) {
			String data = dataBox.getData();//����� �����͸� �����´�.
		}
	}
}
