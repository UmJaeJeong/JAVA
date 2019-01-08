package sec_verify08;

public class ShipExample {

	public static void main(String[] args) {
		Boat bo = new Boat();
		Cruise cr = new Cruise();
		ShipUtil su = new ShipUtil();
		
		System.out.println("Boat"+"가 나를수 있는 인원 : "+bo.carry());
		System.out.println("Boat"+"가 나를수 있는 무기 : "+bo.move());
		
		System.out.println("Cruise"+"가 나를수 있는 인원 : "+cr.carry());
		System.out.println("Cruise"+"가 나를수 있는 무기 : "+cr.move());
		
		su.search(bo);
		su.search(cr);
	

	

	}

}
