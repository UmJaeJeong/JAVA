package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.ChannelUp();
		
		System.out.println("현재 채널은"+ctv.channel+"입니다.");
		ctv.displayCaption("캡션기능 출력 메세지 : Hello, World");
		ctv.caption = true;
		ctv.displayCaption("캡션기능 출력 메세지 : Hello, World");

	}

}
