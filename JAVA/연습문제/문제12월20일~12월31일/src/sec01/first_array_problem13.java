package sec01;

import java.util.Scanner;

public class first_array_problem13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[101];
		
		for(int i=1; i<cnt.length;i++) {
			int x = (int)(Math.random()*10);
			cnt[x]++;
		}
		
		int max =0;
		int idx =0;
		for(int i=1; i<cnt.length;i++) {
			if(max<cnt[i]) {
				max = cnt[i];
				idx = i;
			}
		}
		
		System.out.println("가장 많이 생성된 수는 :"+idx+"로"+max+"개 생성되었습니다.");
		
	}

}
