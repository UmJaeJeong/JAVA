package sec03_exam_captionTv;

public class Tv {
	boolean power; //전원상태(on/off)
	int channel=10;		//채널
	
	public Tv() {
		super();//Object생성자 호출
		System.out.println("조상클래스 생성자 호출");
	}
	
	
	//전원기능
	public void power() {
		this.power = !power;
		System.out.println("조상클래스 Tv의 power메서드를 호출하였습니다.");
	}
	
	
	//채널 업 다운 기능
	public void ChannelUp() {
		++this.channel;
		System.out.println("조상클래스 Tv의 ChannelUp메서드를 호출하였습니다.");
	}
	
	
	public void ChannelDown() {
		--this.channel;
		System.out.println("조상클래스 Tv의 ChannelDown메서드를 호출하였습니다.");
	}
}
