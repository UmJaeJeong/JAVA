package sec2_verify06;

public class Animal {
	String name;
	int age;
	
	Animal(){
	}
	Animal(String name){
		this.name = name;
	}
	Animal(String name, int age){
		this.name= name;
		this.age = age;
	}
	
	int print() {
		System.out.println("�� ������ �̸��� "+this.name+"�̸�, ���̴� "+this.age+"�Դϴ�.");
		return 0;
	}
	String print(String name, int age) {
		String answer;
		answer = "�� ������ �̸��� "+name+"�̸�, ���̴� "+age+"�Դϴ�.";
		return answer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�� ������ �̸��� "+this.name+"�̸�, ���̴� "+this.age+"�Դϴ�.";

	}
}
