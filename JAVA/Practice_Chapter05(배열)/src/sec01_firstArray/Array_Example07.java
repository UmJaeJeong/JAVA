package sec01_firstArray;

public class Array_Example07 {

	public static void main(String[] args) {
		
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length;i++) {
			ball[i] = (int)(Math.random()*45);
		}
		System.out.println("정렬 전");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
		}
		//Array,sort(ball);
		//소팅을 하기 위해서는 더블루프+ 조건문 필수이다. 잊지 않도록 하자
		for(int i=0; i<ball.length;i++) {
			for(int j=0; j<ball.length-1;j++) {
				if(ball[j]>ball[j+1]) {
					int temp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1] = temp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i]);
		}
		
	}

}
