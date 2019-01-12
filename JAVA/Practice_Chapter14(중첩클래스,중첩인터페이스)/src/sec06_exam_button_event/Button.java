package sec06_exam_button_event;

public class Button {
	
	//중첩인터페이스
	interface onClickListener{
		void OnClick();
	}
	
	//인터페이스 참조변수선언
	onClickListener listener;
	
	//setter-- 매개변수로 인터페이스 타입이 선언되었다면 무슨의미인가?
	void setOnClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	//touch()메서드가 호출되면서 중첩인터페이스를 구현한 객체의
	//OnClick()[메서드가 호출됨
	void touch() {
		listener.OnClick();
	}
	
}
