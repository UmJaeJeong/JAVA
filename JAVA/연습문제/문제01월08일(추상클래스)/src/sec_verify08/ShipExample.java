package sec_verify08;

public class ShipExample {

	public static void main(String[] args) {
		Boat bo = new Boat();
		Cruise cr = new Cruise();
		ShipUtil su = new ShipUtil();
		
		System.out.println("Boat"+"�� ������ �ִ� �ο� : "+bo.carry());
		System.out.println("Boat"+"�� ������ �ִ� ���� : "+bo.move());
		
		System.out.println("Cruise"+"�� ������ �ִ� �ο� : "+cr.carry());
		System.out.println("Cruise"+"�� ������ �ִ� ���� : "+cr.move());
		
		su.search(bo);
		su.search(cr);
	

	

	}

}
