package sec;

public class first_array_problem7 {

	public static void main(String[] args) {
		
		int[] ball = new int[20];
		for(int i=0; i<20;i++) {
			ball[i] = i+1;
			System.out.println("ball["+i+"] = "+ball[i]);
		}
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<19;j++) {
				if(ball[j]<ball[j+1]) {
					int temp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1] = temp;
				}
			}
		}
		System.out.println();

		for(int i=0; i<6;i++) {
			System.out.println("ball["+i+"] = "+ball[i]);
		}
		
		
			
	}

}
