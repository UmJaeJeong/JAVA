package sec_verify08;

public class AirForce extends Unit{
	public AirForce() {
		super("AirForce");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> ���� �غ�");
		System.out.println(super.getName()+" >> �̷�");
		System.out.println(super.getName()+" >> ���� ����");
		bombing();
		System.out.println();
	}
	
	void bombing() {
		System.out.println(super.getName()+" >> ����");
	}
}
