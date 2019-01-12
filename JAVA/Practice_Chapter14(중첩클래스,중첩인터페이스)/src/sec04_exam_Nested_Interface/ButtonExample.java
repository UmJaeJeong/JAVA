package sec04_exam_Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		
		//setOnClickListener()의 매개변수가 무엇인가? 바로 인터페이스이다.
		//그럼 매개변수로 무엇을 넘겨야 하나?
		btn.setOnClickListener(new CallListener());
		btn.touch();
		//btn.setOnClickListener(null);
		btn.touch();
		
		btn.setOnClickListener(cl);
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(ml);
		btn.touch();
	}

}
