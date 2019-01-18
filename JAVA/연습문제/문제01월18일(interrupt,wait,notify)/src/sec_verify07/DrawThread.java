package sec_verify07;

public class DrawThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("그림 그리는 중");
			if(Thread.interrupted()) {
				System.out.println("interrupt()호출 됨");
				break;
			}
		}
		System.out.println("스레드 자원 정리");
		System.out.println("스레드 종료");
	}
}
