package sec_verify07;

public class PetExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name ="누렁이";
		dog.weigth = 10;
		
		Bird bird = new Bird();
		bird.flightYN = true;
		bird.type = "앵무새";
		
		dog.move();
		bird.move();
		System.out.println("강아지의 이름은 "+dog.name+"이고, 몸무게는 "+dog.getWeight()+"kg 입니다.");
		System.out.print("새의 종류는 "+bird.type+"고, ");
		if(bird.getFlight()) {
			System.out.println("날 수 있습니다.");
		}else {
			System.out.println("날 수 없습니다.");
		}
	}

}
