package sec_verify05;

public class MyExp {
	int base;
	int exp;
	
	public int getValue() {
/*		int value=1;
//		for(int i=0; i<this.exp;i++) {
//			value*=this.base;
//		}
		return value;*/
		return (int)Math.pow(this.base, this.exp);
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.base+"ÀÇ "+this.exp+"½Â = "+getValue();
	}
	
	
}
