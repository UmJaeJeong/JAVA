package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameExample2 {

	public static void main(String[] args) {
		//�ռ� ���������� �������� ������ܿ� ��ġ������ ������ �߰��� ��ġ�� ���Ѻ���
		//�����̴�.
		Frame f = new Frame("Logni");
		f.setSize(300,200);
		
		//������ Toolkit��ü�� ��´�.
		Toolkit tk = Toolkit.getDefaultToolkit();
		//ȭ���� ũ�⸦ ���Ѵ�.
		Dimension screenSize = tk.getScreenSize();
		
		System.out.println(screenSize.toString());
		
		//ȭ�� ũ�⸦ ���ݰ����� Frameũ���� ���ݰ��� �A ��ġ�� �ϸ�
		//Frame�� ȭ�� ��� ��ġ�ϰ� �ȴ�.
		//150, 100�� ���� ������ �������� �������� ������ �����̴�.
		f.setLocation(screenSize.width/2-150, screenSize.height/2 -100);
		f.setVisible(true);	//������ Frame�� ȭ�鿡 ���̵��� �Ѵ�.
	}

}
