package sec03_time;

public class SystemTimeExample {
	
	public static void main(String[] args) {
	
		//프로그램의 소요시간 측정을 할때 사용하면 유용하다.
		int sum = 0;
		//long time1 = System.nanoTime(); //10의 -9승값 리턴
		long time1 = System.currentTimeMillis(); //10의 -3승값 리턴
		for(int i=1; i<=1000000; i++) 
			sum += i;
		
		//long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		System.out.println("1~1000000까지의 합: " + sum);
		//System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
		System.out.println("계산에 " + (time2-time1) + " 밀리초가 소요되었습니다.");
	}
}
