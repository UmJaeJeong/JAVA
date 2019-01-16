package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(str,",");
		
		
		System.out.println("String의 split()를 이용한 방법");
		String[] sp = str.split(",");
		for(int i=0; i<sp.length;i++)
			System.out.println(sp[i]);

		System.out.println();
		System.out.println("StringTokenizer를 이용한 방법");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
