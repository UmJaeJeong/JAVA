package sec_verify08;

public class UnitExample {

	public static void main(String[] args) {
		Unit[] units = new Unit[5];
		units[0] = new AirForce();
		units[0].setName("��1���������");
		units[1] = new AirForce();
		units[1].setName("��38������������");
		units[2] = new Navy();
		units[2].setName("���� ��������");
		units[3] = new Army();
		units[3].setName("��ȣ�δ�");
		units[4] = new Army();
		units[4].setName("������ǳ�δ�");
		
		
		for(Unit a : units) {
			if(a instanceof Unit)
			a.attack();
		}


	}

}
