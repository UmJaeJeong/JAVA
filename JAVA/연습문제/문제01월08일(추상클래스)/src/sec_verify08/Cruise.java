package sec_verify08;

public class Cruise extends Ship{
	
	@Override
	public int move() {
		return 200;
	}
	@Override
	public int carry() {
		return 300;
	}
	
	public String name() {
		return "ÀüÇÔ ¹«±ÃÈ­";
	}
}
