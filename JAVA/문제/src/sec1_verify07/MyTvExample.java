package sec1_verify07;

public class MyTvExample {

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.setChannel(101);
		tv.setChannel(8);
		tv.setChannel(15);
		System.out.println("���� CH:"+tv.channel);
		System.out.println("���� CH:"+tv.prevChannel);
		tv.setVolume(150);
		tv.setVolume(20);
		tv.setVolume(25);
		System.out.println("���� VOL:"+tv.volume);
		System.out.println("���� VOL:"+tv.prevVolume);
	}

}
