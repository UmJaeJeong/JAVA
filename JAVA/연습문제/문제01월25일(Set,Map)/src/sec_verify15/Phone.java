package sec_verify15;

public class Phone {
	private String name;
	private String address;
	private String telNum;

	public Phone(String name, String address, String telNum) {
		this.name = name;
		this.address = address;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "�̸� : "+this.name+"\n�ּ� : "+this.address+"\n��ȭ��ȣ"+this.telNum;
	
	}
}
