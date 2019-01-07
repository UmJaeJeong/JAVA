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
			System.out.println("볼륨이 100을 넘거나, 0이거나, 음수일 수는 없습니다.!");
		}
		
	}
	void setChannel(int channel) {
		if(channel<=100&channel>=0) {
		this.prevChannel = this.channel;
		this.channel = channel;
		}else {
			System.out.println("채널이 100을 넘거나, 0이거나, 음수일 수는 없습니다.!");

		}
	}
	int getVolume() {
		return this.volume;
	}
	int getChannel() {
		return this.channel;
	}
	void getoPrevChannel() {
		System.out.println("이전 CH:"+this.prevChannel);
	}
	void getoPrevVolume() {
		System.out.println("이전 VOL:"+this.prevVolume);

	}
	
	
}
