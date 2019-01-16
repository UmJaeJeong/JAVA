package sec_verify05;

import java.util.*;
public class SplitExample {
	
	public static void main (String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1(split() 이용)
		String[] tokens = str.split(",");
		
		System.out.println("String의 split()를 이용한 방법");
		for(String token : tokens) 
			System.out.println(token);
	
		System.out.println();
		
		//방법2(StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("StringTokenizer를 이용한 방법");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
