package sec_verify03;

public class HankookTire extends Tire{

	public HankookTire(String location, int accumulatedRotation) {
		super(location, accumulatedRotation);
	}
	
	@Override
	public boolean roll() {
		boolean ro = false;
		if(this.accumulatedRotation>0) {
			ro = true;
		}else {
			ro = false;
		}
		return ro;
	}
	
}
