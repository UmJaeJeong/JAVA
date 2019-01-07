package sec_verify05;

public class Car {
	String color;
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
	void downSpeed(int speed) {
		this.speed -= speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
