package sec_verify11;

import java.util.Scanner;

public class Player {
	private String name;
	private String word;
	Scanner sc  = new Scanner(System.in);
	
	Player(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	String sayWord() {
		String an = sc.nextLine();
		this.word = an;
		return this.word;
	}
	
	boolean succeed(String lastWord) {
		int lastidx = lastWord.length();
		boolean ret = false;
		if(lastWord.charAt(lastidx-1)==this.word.charAt(0))
			ret = true;
		else ret = false;
		return ret;
	}
	
}
