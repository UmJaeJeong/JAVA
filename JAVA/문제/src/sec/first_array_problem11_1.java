package sec;

import java.util.Scanner;

public class first_array_problem11_1 {
	
	public static void main(String[] args) {
		String[] clap = new String[] {"박수 한번", "박수 두번"};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=0; i<number;i++) {
			int count =-1;
			int answer =i;
			if((answer%10)%3==0&&answer%10!=0)count++;
			answer/=10;
			if((answer%10)%3==0&&answer%10!=0)count++;
			if(count>-1) {
				System.out.println(i+" "+clap[count]);
			}
		}
			
	}

}
