package sec1_verify07;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	int prevVolume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME  = 0;
	final int MAX_CHANNEL  = 100;
	final int MIN_CHANNEL  = 1;

	void setVolume(int volume) {
		if(volume<=100&volume>=0) {
			this.prevVolume = this.volume;
			this.volume = volume;
		}else {
			System.out.println("������ 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�.!");
		}
		
	}
	void setChannel(int channel) {
		if(channel<=100&channel>=0) {
		this.prevChannel = this.channel;
		this.channel = channel;
		}else {
			System.out.println("ä���� 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�.!");

		}
	}
	int getVolume() {
		return this.volume;
	}
	int getChannel() {
		return this.channel;
	}
	void getoPrevChannel() {
		System.out.println("���� CH:"+this.prevChannel);
	}
	void getoPrevVolume() {
		System.out.println("���� VOL:"+this.prevVolume);

	}
	
	
}
