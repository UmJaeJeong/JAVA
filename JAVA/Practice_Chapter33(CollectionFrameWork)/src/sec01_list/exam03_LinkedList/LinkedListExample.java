package sec01_list.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		DecimalFormat df = new DecimalFormat("#,###");
		long startTime;	//시작값
		long endTime;	//종료값
		
		//startTime = System.nanoTime();	//10의 몇승? -9승 일리(-3)->마이크로(-6)->나노(-9)
		startTime = System.currentTimeMillis();	//10의 몇승?
		for(int i=0; i<100000;i++) {
			//ArryList의 0번째 인덱스에 계속적으로 i를 삽입시킨다.
			//String클래스의 valueOf의 정적메서드를 호출하여 값을 String화 시킴
			list1.add(0,String.valueOf(i));	//add에 인덱스를 추가하였기에 삽입이 된다 그러므로 배열복사가 일어난다.
		}
		
		//endTime = System.nanoTime();
		endTime = System.currentTimeMillis();	//초 밀리 마이크로 나노 
		System.out.println("ArryList걸린시간: "+df.format((endTime-startTime))+" ms");
		
		//startTime = System.nanoTime();
		startTime = System.currentTimeMillis();
		for(int i=0; i<100000;i++) {
			list2.add(0,String.valueOf(i));	//add에 인덱스를 추가하였기에 삽입이 된다 그러므로 배열복사가 일어난다.
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList걸린시간: "+df.format((endTime-startTime))+" ms");
		
		//비순차적인 데이터의 추가 및 삭제에서는 ArrayList보다 LinkedList가
		//훨씬 좋은 성능을 발휘한다.
	}
}
