package sec_verify08;

public class ShipUtil {
	static void search(Ship s) {
		if(s instanceof Boat) {
			System.out.println("Boat �̸� : ���� ��Ʈ, �ο�"+s.carry()+", ���� :"+s.move());

		}else if(s instanceof Cruise) {
			System.out.println("Cruise �̸� : ���� ����ȭ, �ο�"+s.carry()+", ���� :"+s.move());

		}
	}
}
