package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		//Unit f - new Fighter();
		/*
		 * A instanceof B �� : A�� BŸ���� ��� true�� ��ȯ�Ѵ�;
		 * ��, A�� B�� ����ȯ(TypeCasting)�ȴٴ� �ǹ̴�.(����Ŭ������ ���̴�.)
		 * �������� ������ ���÷�����.(����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� �����Ҽ� �ִٴ� ��.)
		 * ��� �������� �׷�����.
		 */
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}

		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");

		}

		if(f instanceof Movable) {
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");

		}

		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");

		}
		
		//�����ǵ� �߻�޼��� ȣ��
		f.move(0, 0);
		f.attack(null);
	}

}
