package sec2_verify06;

public class AnimalExample {

	public static void main(String[] args) {
		Animal[] ani  = new Animal[3];
		ani[0] = new Animal();
		ani[1] = new Animal("사자");
		ani[2] = new Animal("호랑이",5);
		ani[0].print();
		System.out.println(ani[1].print(ani[1].name, ani[1].age));
		System.out.println(ani[2].toString());

	}

}
