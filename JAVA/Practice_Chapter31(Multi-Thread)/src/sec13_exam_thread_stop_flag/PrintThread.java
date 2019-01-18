package sec13_exam_thread_stop_flag;

public class PrintThread extends Thread{
	private boolean stop;//flag플래그 선언(기본값 : false)
	
	public void setstop(boolean stop) {
		this.stop =stop;
	}
	
	@Override
	public void run() {
		//외부에서 stop을 true로 설정하면 루프에서 나온다.
		while(!stop) {
			System.out.println("실행 중");
		}
		
		System.out.println("싯그템 자원 정리완료");
		System.out.println("실행종료");
	}
}
