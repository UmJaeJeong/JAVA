package sec04_exam_thismethod;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("Green","����");
		
		System.out.println(c1.toString());//���⼭ ������ �޼���� �������ΰ�?
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
