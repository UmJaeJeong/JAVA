package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.ChannelUp();
		
		System.out.println("���� ä����"+ctv.channel+"�Դϴ�.");
		ctv.displayCaption("ĸ�Ǳ�� ��� �޼��� : Hello, World");
		ctv.caption = true;
		ctv.displayCaption("ĸ�Ǳ�� ��� �޼��� : Hello, World");

	}

}
