package sec01_exam_runtime_exception;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class ClassCastExceptionExample {

	
	public static void main(String[] args) {
		Animal animal = new Dog();
		//down-casting(정상)
		Dog dog = (Dog)animal;
		
		//ClassCastException발생
		//Cat cat = (Cat)animal;
		
		//Dog dog = new Dog();
		changeDog(dog);
		//changeDog(new Dog);
		
		//Cat cat = new Cat();
		changeDog(new Cat());
		//change(new Cat());
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("Dog으로 변환 성공");
		}else {
			System.out.println("Dog으로 변환 실패");
		}
	}
}
