package sec02_exam_starCraftUnit;

public class Tank extends Unit{
	String str="탱크";
	//생성자
	public Tank() {}
	
	//Tank가 Move하는 것에 맞게끔 재저의
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크의 위치 : "+this.x+", "+this.y+"에 "+this.str+"가/이 멈춥니다.");
	}
	
	public void sizeMode() {
		this.str = "공격 모드 : 시즈 모드 변환";
		System.out.println(this.str);
	}
}
