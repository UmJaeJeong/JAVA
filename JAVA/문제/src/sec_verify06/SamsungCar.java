package sec_verify06;

public class SamsungCar {
	String company;
	String model;
	String color;
	int maxSpeed;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str ="";
		str+=this.company;
		if(this.company.equals("삼성")) {
			str+="가 맞습니다.%n";
		}else {
			str+="가 아닙니다.%n";
		}
		
		if(this.company.equals("삼성")) {
			str+="차 모델이 맞습니다..%n";
		}else {
			str+="차 모델이 아닙니다.%n";
		}
		
		str+="속도는 음수일수가 없네요 뒤로 갈까요?.%n";
		str+="Samsung회사의 white색상의 SM5모델이며, 240의 최고 속도를 자랑합니다.";
		
		return str;
	}
}
