package sec_verify03;

public class SpotsCarExample {

	public static void main(String[] args) {
		Car car = new Car();
		SportsCar scar = new SportsCar();
		
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedUp();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedUp();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedUp();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedDown();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedDown();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");
		scar.speedDown();
		car.stop();
		scar.stop();
		System.out.println("���� ������ī�� �ӵ��� "+scar.getSpeed()+"Km�Դϴ�.");


	}
	

}
