package sec_verify03;

public class ColorPoint extends Point{
	String Color;
	
	ColorPoint(){}
	void setColor(String Color) {
		this.Color = Color;
	}
	
	void showColorPoint() {
		System.out.print("������ "+this.Color+"���� ��ǥ" );
		super.showPoint();
	}
}
