package sec_verify01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("�����ڵ���");
		car.setModel("�׷���");
		car.setColor("����");
		car.setMaxSpeed(350);
		car.setCurSpeed(0);
		System.out.println("����ȸ��: "+car.getCompany());
		System.out.println("�𵨸�: "+car.getModel());
		System.out.println("����: "+car.getColor());
		System.out.println("�ְ�ӵ�: "+car.getMaxSpeed());
		System.out.println("����ӵ�: "+car.getCurSpeed());
		car.setCurSpeed(60);
		System.out.println("������ �ӵ�: "+car.getCurSpeed());

	}

}
