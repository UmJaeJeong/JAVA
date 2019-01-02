package sec_verify02;

public class MountainBike extends Bicycle {
	String frame;
	int gear;
	String money;
	
	public MountainBike(int id, String brand ) {
		super(id, brand);
	}
	
	void prtInof() {
		System.out.println("내 자전거는 상표(브랜드)가 :"+super.brand+"입니다.");
		System.out.println("기어는 "+this.gear+"입니당~!");
		System.out.println("프레인은 "+this.frame+"입니당~!");
		System.out.println("가격은 "+money+"입니당~!");
	}
}
