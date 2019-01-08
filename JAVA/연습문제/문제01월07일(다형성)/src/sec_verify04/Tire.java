package sec_verify04;

public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	public Tire(String location, int accumulatedRotation) {
		this.location = location;
		this.accumulatedRotation = accumulatedRotation;
	}
	
	public boolean roll() {
		boolean ro = false;
		if(this.accumulatedRotation-->1) {
			ro = true;
		}else {
			ro = false;
		}
		return ro;
	}
}
