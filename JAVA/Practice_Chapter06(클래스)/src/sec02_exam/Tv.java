package sec02_exam;

public class Tv {
	//Tv의 속성(멤버변수) 다른말로 필드라고도 한다.
	String color;
	boolean power;
	int channel;
	
	//멤버메서드(함수)
	//Tv를 켜거나 끄는 기능을 하는 메서드
	public void power() {
		this.power = !this.power;
	}
	
	//Tv의 채널을 높이는 기능을 하는 메서드
	public void channelUp() {
		++this.channel;
	}
	
	
	//Tv의 채널을 낮추는 기능을 하는 메서드
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("채널은 음수값이 없습니다.");
		}
		--this.channel;

	}
}
