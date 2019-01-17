package sec_verify04_1;

public class Number {

	public synchronized void addNum() {
		int sum = 0;
		for(int i=0; i<1000;i++) {
			sum+=i;
		}
		System.out.println("0~1000까지의 합을 구합니다.");
		System.out.println(Thread.currentThread().getName()+"의 결과 :"+sum);
	}

}
