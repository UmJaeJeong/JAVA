package sec03_exam_create_threadExtends_02;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		Timerthread t= new Timerthread();
		t.start();
		
		String input = JOptionPane.showInputDialog("아무거나 입력하세요");
		System.out.println("입력하신 값은"+input+"입니다.");
	}

}
