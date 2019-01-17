package sec05_exam_threadPrioroty;

public class CalcThread extends Thread{

	int sum;
	public CalcThread(String name) {
		this.setName(name);// 이름지정(Thread+i)
		
	}
	
	@Override
	public void run() {
		//2천만번 루핑
		for(int i=0; i<20000000;i++) {		
			sum+=i;
		}
		System.out.println("작업을 마친 스레드 : "+this.getName()+".합계 : "+this.sum);
	}
}
