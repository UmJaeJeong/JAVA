package sec_verify11;

import java.util.Scanner;

public class WordGameApp {
	private String startWord="아버지";
	private Player[] players;
	private Scanner sc = new Scanner(System.in);
	

	void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int x = sc.nextInt();
		players = new Player[x];
		sc.nextLine();
		for(int i=0; i<x;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String a = sc.next();
			
			players[i] = new Player(a);
		}
	}
	
	void run() {
		System.out.println("시작하는 단어는 "+startWord);
		String compare;
		
		while(true) {
			for(int i=0; i<players.length;i++) {
				System.out.print(players[i].getName()+">>");
				compare = players[i].sayWord();
				
				if(!players[i].succeed(startWord)) {
					System.out.println(players[i].getName()+"이 졌습니다.");
					return;
				}
							
				startWord = compare;
				
			}
		}
	}
}
