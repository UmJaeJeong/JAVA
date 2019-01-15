package sec_verify04;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		Random rand1 = new Random();

		System.out.println("로또 번호 생성기 프로그램입니다.");
		System.out.println("자동으로 번호를 선택합니다.");
		System.out.print("선택 번호 : ");
		int[] choice = new int[6];
		int[] choice1 = new int[6];

		for(int i=0 ; i<6;i++) {
			choice[i] = (int)(Math.random()*44+1);
			System.out.print(choice[i]+" ");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for(int i=0; i<6;i++) {
			choice1[i] =(int)(Math.abs(rand1.nextInt()%44)+1);
			System.out.print(choice1[i]+" ");
		}
		
		Arrays.sort(choice);
		Arrays.sort(choice1);
		
		boolean check =false;
		for(int i=0; i<6;i++) {
			if(choice[i]==choice1[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		System.out.println();
		if(!check) System.out.println("당첨 여부 :  당첨되지 않았습니다.");
	}

}
