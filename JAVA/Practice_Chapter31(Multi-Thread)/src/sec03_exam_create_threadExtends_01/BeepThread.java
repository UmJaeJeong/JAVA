package sec03_exam_create_threadExtends_01;

import java.awt.Toolkit;

//ThreadŬ�����κ��� ����� �޾Ƽ� �ۼ��Ѵ�.
public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			super.run();
		}
	}

}
