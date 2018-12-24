package sec_verify04;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] cir = new Circle[2];
		for(int i=0; i<2;i++) {
			cir[i] = new Circle();
		}
	
		cir[0].name ="자바피자";
		cir[0].radius = 10;
		
		cir[1].name = "자바도넛";
		cir[1].radius = 2;

		
		for(Circle ci : cir) {
			System.out.println(ci);
		}
	}

}
