package sec12.exam02_thread_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProductThread productthread = new ProductThread(dataBox);
		ConsumerThread consumerther = new ConsumerThread(dataBox);
		
		productthread.start();
		consumerther.start();
	}

}
