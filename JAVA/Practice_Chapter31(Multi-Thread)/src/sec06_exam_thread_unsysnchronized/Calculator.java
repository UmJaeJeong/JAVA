package sec06_exam_thread_unsysnchronized;

public class Calculator {
private int memory;

public int getMemory() {
	return this.memory;
}

public void setMemory(int memory) {
	this.memory =memory;
	//2초 일시정지(TIMED_WAITING)
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	//현재 실행중인 스레드 이름과 memory값을 출력
	System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	
}

}
