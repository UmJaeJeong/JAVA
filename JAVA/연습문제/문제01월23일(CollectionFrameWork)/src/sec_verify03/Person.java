package sec_verify03;

public class Person {
	private String name;
	private int age;
	private String handPhone;

	public Person(String name, int age, String handPhone) {
		this.name =name;
		this.age = age;
		this.handPhone= handPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(String handPhone) {
		this.handPhone = handPhone;
	}
	
	
}
