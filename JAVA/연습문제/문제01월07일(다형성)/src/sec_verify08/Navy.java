package sec_verify08;

public class Navy extends Unit{

	public Navy() {
		super("Navy");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> ���� �غ�");
		System.out.println(super.getName()+" >> ��� �߻�");
		System.out.println(super.getName()+" >> ���� ���");
		incleus();
		System.out.println();

	}
	
	public void incleus() {
		System.out.println(super.getName()+" >> ����� �⵿");

	}
	
	
	
}
