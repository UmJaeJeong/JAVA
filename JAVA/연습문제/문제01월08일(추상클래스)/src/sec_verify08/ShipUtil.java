package sec_verify08;

public class ShipUtil {
	static void search(Ship s) {
		if(s instanceof Boat) {
			System.out.println("Boat 이름 : 썡쌩 보트, 인원"+s.carry()+", 무기 :"+s.move());

		}else if(s instanceof Cruise) {
			System.out.println("Cruise 이름 : 전함 무궁화, 인원"+s.carry()+", 무기 :"+s.move());

		}
	}
}
