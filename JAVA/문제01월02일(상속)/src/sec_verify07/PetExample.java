package sec_verify07;

public class PetExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name ="������";
		dog.weigth = 10;
		
		Bird bird = new Bird();
		bird.flightYN = true;
		bird.type = "�޹���";
		
		dog.move();
		bird.move();
		System.out.println("�������� �̸��� "+dog.name+"�̰�, �����Դ� "+dog.getWeight()+"kg �Դϴ�.");
		System.out.print("���� ������ "+bird.type+"��, ");
		if(bird.getFlight()) {
			System.out.println("�� �� �ֽ��ϴ�.");
		}else {
			System.out.println("�� �� �����ϴ�.");
		}
	}

}
