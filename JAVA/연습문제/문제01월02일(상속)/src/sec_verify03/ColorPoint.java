package sec_verify03;

public class ColorPoint extends Point{
	String Color;
	
	ColorPoint(){}
	void setColor(String Color) {
		this.Color = Color;
	}
	
	void showColorPoint() {
		System.out.print("색상이 "+this.Color+"점의 좌표" );
		super.showPoint();
	}
}
