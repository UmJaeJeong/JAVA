package sec12.exam02_thread_wait_notify;

public class ProductThread extends Thread{
	//공유객체
	private DataBox dataBox;
	public ProductThread(DataBox dataBox) {
		this.dataBox=dataBox;
	}
	@Override
	public void run() {
		for(int i=1; i<=3;i++) {
			String data = "Data"+i;		//데이터를 생산
			dataBox.setData(data);		//공유객체에 데이터 지정.
		}
	}
	
}
