package sec03_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable{
	//static int hitPoint;
	
	public SCV() {
		super(150);		//Tank�� HP�� 125�̴�.
		System.out.println(this.toString()+"�� HP��"+this.MAX_HP+"�Դϴ�. ��~!");
		this.hitPoint = this.MAX_HP;
	}
	
	//Repairable�������̽��� ������ Ŭ������ �Ű������� ���ü��� ������ �ָ�!
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count = 0;
			//Unit�� Ÿ���� �´ٸ� �ڼ�Ŭ����(Tank, DropShip�� UnitŸ������ ��������ȯ)
			Unit unit = (Unit)r;
			System.out.println("���� ü��:" +unit.MAX_HP);
			
			while(unit.hitPoint != unit.MAX_HP) {
				/*Unit�� HP�� ������Ų��.*/
				unit.hitPoint++;
				count++;
			}
			System.out.println(unit+"�� HP��" +count+" ��ŭ ������ �������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	//�Ű�����Ÿ������ Repairable�������̽��� ���Ե�. �� �ǹ̴� �����ΰ�?
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		//Ÿ�� üũ�ϴ� ��
		if(r instanceof Unit) {
			Unit unit = (Unit)r;
			System.out.println(unit+"�� "+Damage+"��ŭ �������� �Ծ����ϴ�.!");
			System.out.println(unit +"�� ���� HP�� "+(unit.MAX_HP-Damage)+"�Դϴ�.!");
			System.out.println(unit+"�� ������ �ʿ��մϴ�. ��~!");
		}
		this.hitPoint -= Damage; //ü�°���
	}
	
}
