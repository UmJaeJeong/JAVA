package sec12.exam02_thread_wait_notify;

public class DataBox {
	private String data;
	/*�Ʒ� getData()�� consumerThread�� data�� �о���� �Ǿ��ִ�.
	�׷��� null�̸� wait(�Ͻ����� : Blocked����)�ϰ�, null�� �ƴ϶��
	ConsumerThread�� ���� �����͸� ����ϸ鼭, �ٸ� waiting�� �����带
	notify�� ���ؼ� ��������·� �ٲ۴�.*/
	public synchronized String getData() {
		//�о�� �����Ͱ� ���ٸ�...
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue = this.data;
		System.out.println("ConsumerThread�� ���� ������ : "+returnValue);
		this.data = null;
		//�ٸ� ������(������ ������)�� �ƿ��.(�� ���������(Runnalbe)�� �����)
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data){
		//ConsumerThread�� �����͸� ���� ���ٸ�...
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;	//�ʵ忡 ���� �����ϰ�
		System.out.println("ProducerThread�� ������ ������ : "+this.data);
		notify();			//�ٸ� ������(ConsumerThread)�� �ƿ��.
	}
	
	/*
	 * ����������� wait()�� notify()�� �̿��Ͽ� ������ ���鼭 ������
	 * �� ������ü�� �����ϱ� ���ؼ��� synchronized�� ����ȭ Ű���尡
	 * ���� ���� ���ܵ� �߻����� �ƴ��ϰ�, �������� ��Ȯ���� ����
	 * �Ѵ�. ��, �ٽ� ���� ��ü ����� �Ͼ�� �Ҥ��ٴ� ���̴�.
	 */
	
	

}
