package sec_verify02;

public class Defender extends Player{
	int def;
	public Defender(String name, int age, int backNumber, int spd, int def) {
		super(name, age, backNumber, spd);
		this.def = def;
	}
	
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	@Override
	public void infoPrint() {
		
	}
	
}
