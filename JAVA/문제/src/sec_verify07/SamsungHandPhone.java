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
			str+="���� �½��ϴ�.%n";
		}else {
			str+="���� �ƴմϴ�.%n";
		}
		
		if(this.company.equals("Samsung")) {
			str+="Samsung�� ���� �½��ϴ�.%n(Samsung�� : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)%n";
		}else {
			str+="Samsung�� ���� �ƴմϴ�.%n(Samsung�� : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)%n";
		}
		
		str+="Samsungȸ���� white������ Galaxy5���̸�, ������� 2013���Դϴ�.";
	
		return str;
	}
	
}
