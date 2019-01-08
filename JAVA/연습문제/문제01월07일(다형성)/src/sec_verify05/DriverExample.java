package sec_verify05;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		Driver dr = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		ve.run();
		dr.drive(bus);
		dr.drive(taxi);
	}

}
