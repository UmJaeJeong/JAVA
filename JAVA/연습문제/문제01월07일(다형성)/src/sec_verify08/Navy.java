package sec_verify08;

public class Navy extends Unit{

	public Navy() {
		super("Navy");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> 공격 준비");
		System.out.println(super.getName()+" >> 어뢰 발사");
		System.out.println(super.getName()+" >> 지상 상륙");
		incleus();
		System.out.println();

	}
	
	public void incleus() {
		System.out.println(super.getName()+" >> 잠수정 출동");

	}
	
	
	
}
