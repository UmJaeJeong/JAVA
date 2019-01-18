package sec01_exam_create_singleThread;

import java.awt.Toolkit;

public class BeepPrintExample {
	
	//main() ������� JVM�� �������� �������.
	public static void main(String[] args) {
		/*
		 * �Ʒ� �ڵ�� �̱۽����忡�� ���ư��� �۾��̹Ƿ�, �������� 5�� �˸��� �� ��,
		 * "��"�̶�� ���ڿ��� 5�� ��µȴ�. ������, �츮�����ϴ� ���� "��"�̶��
		 * ���ڿ��� ��µǸ鼭 �������� ���� ��µǴ°��� ���Ѵ�.
		 * �̰��� �ٷ� �̱� �������� �����̴�. �������̶�� ���̴�.
		 * �̰��� ��Ƽ������� �ٲ㰡�� ���� ������ �忡�� �츮�� �ؾ� �� ���̴�.
		 * �������� 5�� �ݺ��ؼ� �Ҹ����� ��.
		 * Toolkit�� AWT(Abstract Window Toolkit)�߻�Ŭ������ ��ӹ��� �Ǵٸ� �߻�Ŭ�����̴�.
		 * �� �� GUI���õ� �޼������ �ִ�. getDefaultToolkit()�� �⺻���� �޼��带 �����س��� �޼����̴�.
		 */
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();//������
			//���� �޼��� sleep()�� �����ϴ� �����带 0.5�ʰ� ���ߴ±��
			//���α׷��� �ʹ� ���� ���ư��ϱ� ������
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		//"��"�̶�� ���ڿ��� 5�� �ݺ��ؼ� �����
		for(int i=0; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
