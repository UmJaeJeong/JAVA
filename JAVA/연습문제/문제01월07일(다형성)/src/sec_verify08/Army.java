package sec_verify08;

public class Army extends Unit{

	public Army() {
		super("Army");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName()+" >> ���� �غ�");
		System.out.println(super.getName()+" >> ���� ����");
		tank();
		System.out.println();

	}
	
	public void tank() {
		System.out.println(super.getName()+" >> ��ũ ����");
	}

}
