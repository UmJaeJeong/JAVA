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
		if(this.company.equals("�Ｚ")) {
			str+="�� �½��ϴ�.%n";
		}else {
			str+="�� �ƴմϴ�.%n";
		}
		
		if(this.company.equals("�Ｚ")) {
			str+="�� ���� �½��ϴ�..%n";
		}else {
			str+="�� ���� �ƴմϴ�.%n";
		}
		
		str+="�ӵ��� �����ϼ��� ���׿� �ڷ� �����?.%n";
		str+="Samsungȸ���� white������ SM5���̸�, 240�� �ְ� �ӵ��� �ڶ��մϴ�.";
		
		return str;
	}
}
