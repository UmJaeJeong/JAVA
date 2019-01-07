package sec_verify01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("현대자동차");
		car.setModel("그랜저");
		car.setColor("검정");
		car.setMaxSpeed(350);
		car.setCurSpeed(0);
		System.out.println("제작회사: "+car.getCompany());
		System.out.println("모델명: "+car.getModel());
		System.out.println("색깔: "+car.getColor());
		System.out.println("최고속도: "+car.getMaxSpeed());
		System.out.println("현재속도: "+car.getCurSpeed());
		car.setCurSpeed(60);
		System.out.println("수정된 속도: "+car.getCurSpeed());

	}

}
