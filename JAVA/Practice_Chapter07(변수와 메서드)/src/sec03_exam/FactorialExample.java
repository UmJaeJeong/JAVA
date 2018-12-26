package sec03_exam;

public class FactorialExample {

	public static void main(String[] args) {
		long result = FactorialExample.factorial(5L);
		System.out.println("5!(팩토리얼)값 : "+result);
	}
	
	//자기 자신을 호출하는 재귀
	//for문으로 해도 되나, 코드를 보는것과 코드중복을 제거함으로써 좋다.
	public static long factorial(long n) {
		long result = 0L;
		//비로소 1일때, 재귀호출이 더 이상 안이루어진다. f(1) = 1이니깐
		if(n==0) {
			result = 1;
		}else {
			result = n*factorial(n-1);//메서드 자신을 호출한다.
		}
		
		return result;
	}

}
