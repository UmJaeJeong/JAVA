package sec03_exam_RepairableExample;

public class Tank extends GroundUnit implements Repairable{
	//static int hitPoint;
	public Tank() {
		super(150);		//Tank�� HP�� 125�̴�.
		System.out.println(this.toString()+"�� HP��"+this.MAX_HP+"�Դϴ�. ��~!");
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
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
