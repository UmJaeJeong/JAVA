package sec03_time;

public class SystemTimeExample {
	
	public static void main(String[] args) {
	
		//���α׷��� �ҿ�ð� ������ �Ҷ� ����ϸ� �����ϴ�.
		int sum = 0;
		//long time1 = System.nanoTime(); //10�� -9�°� ����
		long time1 = System.currentTimeMillis(); //10�� -3�°� ����
		for(int i=1; i<=1000000; i++) 
			sum += i;
		
		//long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		System.out.println("1~1000000������ ��: " + sum);
		//System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
		System.out.println("��꿡 " + (time2-time1) + " �и��ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
