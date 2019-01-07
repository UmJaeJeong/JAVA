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
		System.out.println("이 동물의 이름은 "+this.name+"이며, 나이는 "+this.age+"입니다.");
		return 0;
	}
	String print(String name, int age) {
		String answer;
		answer = "이 동물의 이름은 "+name+"이며, 나이는 "+age+"입니다.";
		return answer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이 동물의 이름은 "+this.name+"이며, 나이는 "+this.age+"입니다.";

	}
}
