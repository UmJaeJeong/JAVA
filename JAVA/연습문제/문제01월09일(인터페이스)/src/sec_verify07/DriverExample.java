package sec_verify07;

public class DriverExample {

	public static void main(String[] args) {
		Driver dr = new Driver();
		dr.drive(new Bus());
		dr.stop(new Bus());
		
		dr.drive(new Taxi());
		dr.stop(new Taxi());

	}

}
