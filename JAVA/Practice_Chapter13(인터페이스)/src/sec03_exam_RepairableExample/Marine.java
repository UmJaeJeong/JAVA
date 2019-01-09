package sec03_exam_RepairableExample;

//Marine은 수리를 받는 유닛이 아니므로 Repairable인터페이스를 따로 구현하지 않는다.
public class Marine extends GroundUnit{
	public Marine() {
		super(40);
		this.hitPoint = this.MAX_HP;
	}
}
