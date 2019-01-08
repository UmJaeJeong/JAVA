package sec_verify02;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {
		SupersonicAirplane sa  = new SupersonicAirplane();
		sa.flyMode = 1;
		sa.takeOff();
		sa.fly();
		sa.flyMode=2;
		sa.fly();
		sa.flyMode = 1;
		sa.fly();
		sa.land();
		
	}

}
