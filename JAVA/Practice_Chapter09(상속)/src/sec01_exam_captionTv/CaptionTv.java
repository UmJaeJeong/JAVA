package sec01_exam_captionTv;

public class CaptionTv extends Tv{
	boolean caption;
	public CaptionTv() {
		//super(); //����Ŭ������ ����ȴ� �����Ϸ��� �ڵ����� ȣ������ 
		//��������� 
		System.out.println("�ڼ�Ŭ���� ������ ȣ��");
	}
	
	public void displayCaption(String text) {
		if(this.caption) System.out.println(text);
	}
}
