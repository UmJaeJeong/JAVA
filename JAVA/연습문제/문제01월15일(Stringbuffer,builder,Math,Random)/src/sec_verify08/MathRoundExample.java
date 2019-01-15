package sec_verify08;

public class MathRoundExample {

	public static void main(String[] args) {
		System.out.println("자바에서 제공하는 Math.round(3.17836)를 한 결과 : "+Math.round(3.17836));
		
		System.out.println();
		System.out.println("직접 만든 round()를 사용한 결과");
		System.out.println("3.17836를 둘째 자리에서 반올림 한 결과 : "+round(3.17836,2));
		System.out.println("3.17836를 세째 자리에서 반올림 한 결과 : "+round(3.17836,3));
		System.out.println("3.17836를 네째 자리에서 반올림 한 결과 : "+round(3.17836,4));
		System.out.println("3.17836를 다섯째 자리에서 반올림 한 결과 : "+round(3.17836,5));
	}
	
	static double round(double d, int n) {
		double ret = 0;
		double temp1 = d*Math.pow(10, n-1);
		double temp2 = Math.round(temp1);
		ret  = temp2/Math.pow(10, n-1);
		
		return ret;
	}

}
