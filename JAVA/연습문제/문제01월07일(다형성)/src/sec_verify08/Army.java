package sec_verify08;

public class Army extends Unit{

	public Army() {
		super("Army");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> 공격 준비");
		System.out.println(super.getName()+" >> 지상 공격");
		tank();
		System.out.println();

	}
	
	public void tank() {
		System.out.println(super.getName()+" >> 탱크 공격");
	}

}
