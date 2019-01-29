package sec01.exam01_frame;

import java.awt.Frame;

public class FrameExample01 {
	//showview consol창 
	public static void main(String[] args) {
		//Frame객체를 생성한다.
		Frame frame = new Frame("Login");
		
		//Frame의 크기를 설정한다.(Component클래스에 정의된 메서드)
		frame.setSize(300,500);
		
		frame.setLocation(800, 100);
		//생성한 Frame를 화면에 보이도록 한다.(Component클래스에 정의된 메서드)
		frame.setVisible(true);
		
		//생성된 프레임을 닫기 위해서는 X표를 눌러서 닫기를 해야하는데 지금 이벤트
		//처리를 하지 않았기 때문에 콘솔창의 Terminate버튼을 눌러서 닫도록 한다.
	}

}
