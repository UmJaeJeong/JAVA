package sec_verify03;

public class EqualsExample {

	public static void main(String[] args) {
		Point[] p = new Point[] {
				new Point(2,3), new Point(2,3), new Point(3,10)
		};
		
		for(int i=0; i<3;i++) {
			System.out.println("Point num"+(i+1)+"의 필드 값 : "+p[i].toString());
		}
		if(p[0].equals(p[1])) {
			System.out.println("num1의 필드와 num2의 필드는 같다.");
		}
	}

}
