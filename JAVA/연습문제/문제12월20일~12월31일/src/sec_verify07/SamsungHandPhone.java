package sec_verify07;

public class SamsungHandPhone {
	String company;
	String model;
	String color;
	int release;
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
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		String str="";
		str+=this.company;
		if(this.company.equals("Samsung")) {
			str+="폰이 맞습니다.%n";
		}else {
			str+="폰이 아닙니다.%n";
		}
		
		if(this.company.equals("Samsung")) {
			str+="Samsung폰 모델이 맞습니다.%n(Samsung모델 : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)%n";
		}else {
			str+="Samsung폰 모델이 아닙니다.%n(Samsung모델 : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)%n";
		}
		
		str+="Samsung회사의 white색상의 Galaxy5모델이며, 출시일은 2013년입니다.";
	
		return str;
	}
	
}
