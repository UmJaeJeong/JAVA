package sec01.exam02_lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	public AppMain() {
		System.out.println("생성자 호출");
		System.out.println("실행스레드 : "+Thread.currentThread().getName());
	}
	//JavaFX Launcher스레드가 실행함
	@Override
	public void init() throws Exception{
		//init()에서는 UI생성 및 변경하는 코드가 절대로 오면 안된다. 예외 발생한다.
		//init()은 주로 실행 매개값을 JavaFX Application스레드에 전달할 목적으로 사용되곤 한다.
		System.out.println("init() 실행");
		System.out.println("실행스레드 : "+Thread.currentThread().getName());
	}
	//실행스레드는 JavaFX Application
	@Override
	public void start(Stage primaryStage) throws Exception {
		//start()에서만 UI생성 및 변경하는 코드가 실행되어야 한다.
		//통상적으로 start()만 재정의 해서 개발을 많이 한다.
		System.out.println("start() 실행");
		System.out.println("실행스레드 : "+Thread.currentThread().getName());		
	}
	@Override
	public void stop() throws Exception{
		//윈도우 창의 X표시를 클릭시 자동 실행
		//Application의 종료시 수행해야할 코드들을 주로 작성한다.
		System.out.println("stop() 실행");
		System.out.println("실행스레드 : "+Thread.currentThread().getName());	
	}
	
	public static void main(String[] args) {
		System.out.println("main() 실행");
		System.out.println("실행스레드 : "+Thread.currentThread().getName());
		Application.launch(args);	//main스레드가 JavaFX Application 스레드를 생성함
		
	}

	

}
