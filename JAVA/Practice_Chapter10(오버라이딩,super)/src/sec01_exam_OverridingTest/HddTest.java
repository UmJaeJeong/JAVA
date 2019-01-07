package sec01_exam_OverridingTest;

public class HddTest {

	public static void main(String[] args) {
		HddDisk hd = new HddDisk(500,720);
		UsbMemory um = new UsbMemory(32,520);
		String strhd = hd.Status();
		
		//부모클래스의 메서드가 호출됨
		System.out.println(strhd);
		
		//오버라이딩한 자손클래스의 메서드가 호출됨
		String strum = um.Status();
		System.out.println(strum);
	}

}
