package sec01_exam_OverridingTest;

public class UsbMemory extends HddDisk{
	int capacity;
	int rpm;
	
	//����Ŭ������ �����ڸ� ȣ���ϸ鼭, �ڱ��ڽ��� ��������� �ʱ�ȭ �Ѵ�.
	public UsbMemory(int c, int r) {
		super(10,50);
		this.capacity = c;
		this.rpm = r;
	}
	
	//����Ŭ������ �޼��带 �������̵� �ߵ�.
	@Override
	public String Status() {
		return "�ϵ��ũ�� �뷮��"+super.capacity+"GB�̸�, RPM�� "+super.rpm+"�Դϴ�";
	}

}
