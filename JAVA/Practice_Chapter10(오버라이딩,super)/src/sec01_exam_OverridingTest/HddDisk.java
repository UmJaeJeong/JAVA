package sec01_exam_OverridingTest;

public class HddDisk {
	int capacity;
	int rpm;
	//�⺻������
	public HddDisk() {
		
	}
	//�Ű������� �ִ� ������
	public HddDisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	public String Status() {
		return "�ϵ��ũ�� �뷮��"+this.capacity+"GB�̸�, RPM�� "+this.rpm+"�Դϴ�";
	}
	
}
