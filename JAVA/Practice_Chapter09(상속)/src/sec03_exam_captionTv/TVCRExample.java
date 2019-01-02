package sec03_exam_captionTv;

public class TVCRExample {

	public static void main(String[] args) {
		TVCR ctv = new TVCR();
		Tv tv = new Tv();
		
		tv.power();
		
		//오버라이딩(재정의)한 자손클래스의 power()가 호출됨
		ctv.power();
		
		System.out.println(ctv.getChannel());
		System.out.println(ctv.channel);
		
		ctv.vcr.play();
		ctv.play();
		ctv.stop();
		ctv.rew();
		ctv.ff();
		ctv.ChannelUp();
		ctv.ChannelDown();

	}

}
