package sec_verify03;

public class SportsCar extends Car{
	int getSpeed() {
		return super.speed;
	}
	
	@Override
	void stop() {
		System.out.println("������ī�� ����ϴ�.");
	}
}
