package sec_verify02;

public class Goalkeeper extends Player{
	int save;
	public Goalkeeper(String name, int age, int backNumber, int spd, int save) {
		super(name, age, backNumber, spd);
		this.save = save;
	}
	
	@Override
	public void infoPrint() {
		
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

}
