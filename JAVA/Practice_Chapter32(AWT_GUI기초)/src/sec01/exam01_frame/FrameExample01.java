package sec01.exam01_frame;

import java.awt.Frame;

public class FrameExample01 {
	//showview consolâ 
	public static void main(String[] args) {
		//Frame��ü�� �����Ѵ�.
		Frame frame = new Frame("Login");
		
		//Frame�� ũ�⸦ �����Ѵ�.(ComponentŬ������ ���ǵ� �޼���)
		frame.setSize(300,500);
		
		frame.setLocation(800, 100);
		//������ Frame�� ȭ�鿡 ���̵��� �Ѵ�.(ComponentŬ������ ���ǵ� �޼���)
		frame.setVisible(true);
		
		//������ �������� �ݱ� ���ؼ��� Xǥ�� ������ �ݱ⸦ �ؾ��ϴµ� ���� �̺�Ʈ
		//ó���� ���� �ʾұ� ������ �ܼ�â�� Terminate��ư�� ������ �ݵ��� �Ѵ�.
	}

}
