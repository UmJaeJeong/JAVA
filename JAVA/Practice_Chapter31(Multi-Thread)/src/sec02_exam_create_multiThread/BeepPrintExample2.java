package sec02_exam_create_multiThread;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//���� �����ϴ� ��Ƽ������� �ϴ� 3���� ���
		//���1 -> ��������
		Runnable beepTask = new BeepTask();	//�������̽��� ������
		Thread thread = new Thread(beepTask);
		
		
		//���2 -> �͸� ���� Ŭ���� �̿�
		/*
		 * Thread thread = new Thread(new Runnable{
		 * //�������� 5�� �ݺ��ؼ� �Ҹ����� ��
		 * @Overrid
		 * public void run(){
		 * 	Toolkit toolkit = Toolkit.gfetDefaultToolkit();
		 * 	for(int i=0; i<5;i++){
		 * 	toolkit.beep();
		 * try{
		 * 		Thread.sleep(500);
		 * }catch(InterruptedException e){}
		 * }
		 * });
		 */
		
		
		/*���3 -> ���ٽ�(�Լ��� �������̽�) �̿��Ͽ� �ʰ���ȭ ()�� run�޼����� �Ű�������
		�ǹ��ϴµ� �Ű������� 1���� ���ٴ� �ǹ��Ѵ�. {}�� run()�� ������� �ǹ���.
		���ٽ��� 1.8���� �����ߴµ� ���߿� ���� �ȴ�.*/
		/*Thread thread = new Thread( () -> {
			//�������� 5�� �ݺ��ؼ� �Ҹ�������.
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5;i++) {
				toolkit.beep();
				try{
					 	hread.sleep(500);
				}catch(InterruptedException e){}			  
			}
		});*/
		//Thread thread = new Thread(new BeepTask());
		thread.start();		//run()�� main�����尡 �����϶�� ������. �̶����� main�������
							//beepTask�����尡 ���ÿ� �����. beep�� 5�� ����
		//�Ʒ��� ���ν����尡 ����Ǵ� �κ�
		for(int i=0; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*Runnable beepTask = new BeepTask();	//�������̽��� ������
		thread = new Thread(beepTask);
		thread.start();*/
		
		
		
	}

}
