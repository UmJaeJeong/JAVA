package sec01_exam_OverridingTest;

public class HddTest {

	public static void main(String[] args) {
		HddDisk hd = new HddDisk(500,720);
		UsbMemory um = new UsbMemory(32,520);
		String strhd = hd.Status();
		
		//�θ�Ŭ������ �޼��尡 ȣ���
		System.out.println(strhd);
		
		//�������̵��� �ڼ�Ŭ������ �޼��尡 ȣ���
		String strum = um.Status();
		System.out.println(strum);
	}

}
