package sec_verify02;

public abstract class Phone {
	String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff();

}
