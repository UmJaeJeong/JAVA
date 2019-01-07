package sec_verify11;

import java.util.Scanner;

public class WordGameApp {
	private String startWord="�ƹ���";
	private Player[] players;
	private Scanner sc = new Scanner(System.in);
	

	void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int x = sc.nextInt();
		players = new Player[x];
		sc.nextLine();
		for(int i=0; i<x;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String a = sc.next();
			
			players[i] = new Player(a);
		}
	}
	
	void run() {
		System.out.println("�����ϴ� �ܾ�� "+startWord);
		String compare;
		
		while(true) {
			for(int i=0; i<players.length;i++) {
				System.out.print(players[i].getName()+">>");
				compare = players[i].sayWord();
				
				if(!players[i].succeed(startWord)) {
					System.out.println(players[i].getName()+"�� �����ϴ�.");
					return;
				}
							
				startWord = compare;
				
			}
		}
	}
}
