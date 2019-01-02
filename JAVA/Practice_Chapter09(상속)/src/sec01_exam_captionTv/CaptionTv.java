package sec01_exam_captionTv;

public class CaptionTv extends Tv{
	boolean caption;
	public CaptionTv() {
		//super(); //조상클래스가 선언된다 컴파일러가 자동으로 호출해줌 
		//명시적으로 
		System.out.println("자손클래스 생성자 호출");
	}
	
	public void displayCaption(String text) {
		if(this.caption) System.out.println(text);
	}
}
