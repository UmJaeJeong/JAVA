package sec05_exam_threadPrioroty;

public class CalcThread extends Thread{

	int sum;
	public CalcThread(String name) {
		this.setName(name);// �̸�����(Thread+i)
		
	}
	
	@Override
	public void run() {
		//2õ���� ����
		for(int i=0; i<20000000;i++) {		
			sum+=i;
		}
		System.out.println("�۾��� ��ģ ������ : "+this.getName()+".�հ� : "+this.sum);
	}
}