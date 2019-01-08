package sec_verify04;

public class KumhoTrie extends Tire{

	public KumhoTrie(String location, int accumulatedRotation) {
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
