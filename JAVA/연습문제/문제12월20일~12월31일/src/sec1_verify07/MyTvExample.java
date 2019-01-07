package sec1_verify07;

public class MyTvExample {

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.setChannel(101);
		tv.setChannel(8);
		tv.setChannel(15);
		System.out.println("현재 CH:"+tv.channel);
		System.out.println("이전 CH:"+tv.prevChannel);
		tv.setVolume(150);
		tv.setVolume(20);
		tv.setVolume(25);
		System.out.println("현재 VOL:"+tv.volume);
		System.out.println("이전 VOL:"+tv.prevVolume);
	}

}
