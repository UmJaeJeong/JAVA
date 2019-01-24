package sec_verify09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		save();
		sc.close();
	}
	
	public static void save() {
		String input="";

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		while(true){
			System.out.print(">>");
			input = sc.nextLine();
			if(!input.equals("q") || !input.equals("Q")) {
				System.out.println("종료");
				break;
			}

			if(input.equals("help")) {
				System.out.println("help - 도움말을 보여줍니다.\r\n" + 
						"q 또는 Q - 프로그램을 종료합니다.\r\n" + 
						"history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
			}else if(input.equals("history")) {
				Iterator it = q.iterator();
				int i=0;
				while(it.hasNext()) {
					String str= (String)it.next();
					System.out.println((++i)+"."+str);
				}
			}else {
				if(q.size()<=MAX_SIZE) {
					q.offer(input);
					System.out.println(input);
				}else {
					q.poll();
					q.offer(input);
					System.out.println(input);
				}
				
			}
					
		}
		
	}

}
