package sec01_exam_OverridingTest;

public class HddDisk {
	int capacity;
	int rpm;
	//기본생성자
	public HddDisk() {
		
	}
	//매개변수가 있는 생성자
	public HddDisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	public String Status() {
		return "하드디스크의 용량은"+this.capacity+"GB이며, RPM은 "+this.rpm+"입니다";
	}
	
}
