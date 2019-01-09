package sec01_exam_FighterExample;

public class Fighter extends Unit implements Fightable{
	//인터페이스에 있는 추상메서드 재정의
	@Override
	public void attack(Unit u) {
		System.out.println("공격합니다.");
	}
	
	//인터페이스에 있는 추상메서드 재정의
	@Override
	public void move(int x, int y) {
		System.out.println("이동합니다.");
	}
}
