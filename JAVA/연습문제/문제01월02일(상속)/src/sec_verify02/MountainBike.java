package sec_verify02;

public class MountainBike extends Bicycle {
	String frame;
	int gear;
	String money;
	
	public MountainBike(int id, String brand ) {
		super(id, brand);
	}
	
	void prtInof() {
		System.out.println("�� �����Ŵ� ��ǥ(�귣��)�� :"+super.brand+"�Դϴ�.");
		System.out.println("���� "+this.gear+"�Դϴ�~!");
		System.out.println("�������� "+this.frame+"�Դϴ�~!");
		System.out.println("������ "+money+"�Դϴ�~!");
	}
}
