package sec03_exam_create_threadExtends_02;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		Timerthread t= new Timerthread();
		t.start();
		
		String input = JOptionPane.showInputDialog("�ƹ��ų� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����"+input+"�Դϴ�.");
	}

}
