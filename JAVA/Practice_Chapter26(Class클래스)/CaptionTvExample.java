package sec01_exam_captionTv;

public class CaptionTvExample 
{
	public static void main(String[] args) 
	{		
		CaptionTv ctv = new CaptionTv();
				
		ctv.channel = 10;	 // ���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();     // ���� Ŭ�����κ��� ��ӹ��� ���, channel�� 1������Ŵ.
		
		System.out.println("���� ä���� " + ctv.channel + "�Դϴ�.");			
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : Hello, World");  //false�̹Ƿ� ��¾ȵ�.	
	
		ctv.caption = true;	// ĸ�Ǳ���� �Ҵ�.
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : Hello, World");  // ĸ���� ȭ�鿡 ���� �ش�.
	}
}
