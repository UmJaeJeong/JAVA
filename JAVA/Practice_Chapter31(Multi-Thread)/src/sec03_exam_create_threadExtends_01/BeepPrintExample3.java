package sec03_exam_create_threadExtends_01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//상속을 통한 하위클래스로부터 생성하는 멀티 스레드 방법
		//상속을 이용한 다형성 적용됨.
		Thread thread = new BeepThread();
		thread.start();	//start한번 된것은 재활용을 하지 못해서 에러가 뜬다.

		//"띵"이라는 문자열5번 출력
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
