package sec_verify04;

public class RectExample {

	public static void main(String[] args) {
		Rect[] rect = new Rect[] {
				new Rect(5,15), new Rect(15,5), new Rect(3,10)
		};
		
		for(int i=0; i<3; i++) {
			System.out.println("Rect num"+(i+1)+"�� �ʵ� �� : "+rect[i].toString());
		}
		
		if(rect[0].equals(rect[1])) {
			System.out.println("rect1�簢�� ������ rect2�簢�� ������ ����.");
		}
	}

}
