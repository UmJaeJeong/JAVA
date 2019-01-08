package sec_verify08;

public class AirForce extends Unit{
	public AirForce() {
		super("AirForce");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> 공격 준비");
		System.out.println(super.getName()+" >> 이륙");
		System.out.println(super.getName()+" >> 공중 공격");
		bombing();
		System.out.println();
	}
	
	void bombing() {
		System.out.println(super.getName()+" >> 폭격");
	}
}
