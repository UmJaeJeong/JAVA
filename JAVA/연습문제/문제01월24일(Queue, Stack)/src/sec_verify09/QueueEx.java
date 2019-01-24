package sec_verify09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		save();
		sc.close();
	}
	
	public static void save() {
		String input="";

		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		while(true){
			System.out.print(">>");
			input = sc.nextLine();
			if(!input.equals("q") || !input.equals("Q")) {
				System.out.println("����");
				break;
			}

			if(input.equals("help")) {
				System.out.println("help - ������ �����ݴϴ�.\r\n" + 
						"q �Ǵ� Q - ���α׷��� �����մϴ�.\r\n" + 
						"history - �ֱٿ� �Է��� ��ɾ "+MAX_SIZE+"�� �����ݴϴ�.");
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
