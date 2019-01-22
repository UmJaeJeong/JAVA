package sec16.exam01_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//스레드 이름지정(지정하지 아니하면 Thread-n으로 표시되는 것을 다안다.)
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);	//데몬으로 설정
		autoSaveThread.start();
		
		//Map컬렉선<키, 값> 키로 값을 찾아오는 알고리즘의 현 형태
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		//Map의 키값을 Set형태로 가져온다(Set은 구슬주머니 같은 형태이다.)
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println(""
					+ "스레드 이름 : "+thread.getName()+
					(thread.isDaemon()?"데몬스레드":"주스레드"));
			System.out.println("\t 소속 그룹 : "+thread.getThreadGroup().getName());
			System.out.println();
		}
	}

}
