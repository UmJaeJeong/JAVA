package sec05_exam_generic_polymorphism;

public class ZooBoxExample {

	public static void main(String[] args) {
		
		ZooBox<Animal> animal = new ZooBox<Animal>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird()); //������ ���� ������?
		
		//animal.add(new Object());	//������ ���� ������?
		
		System.out.println("Animal�̰ų� Animal�� ��ӹ��� ���� ����մϴ�.");
		System.out.println(animal.toString());
	}

}
