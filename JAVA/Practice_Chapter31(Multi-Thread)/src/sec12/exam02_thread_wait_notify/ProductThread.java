package sec12.exam02_thread_wait_notify;

public class ProductThread extends Thread{
	//������ü
	private DataBox dataBox;
	public ProductThread(DataBox dataBox) {
		this.dataBox=dataBox;
	}
	@Override
	public void run() {
		for(int i=1; i<=3;i++) {
			String data = "Data"+i;		//�����͸� ����
			dataBox.setData(data);		//������ü�� ������ ����.
		}
	}
	
}
