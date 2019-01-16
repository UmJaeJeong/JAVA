package sec_verify05;

import java.util.*;
public class SplitExample {
	
	public static void main (String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		//���1(split() �̿�)
		String[] tokens = str.split(",");
		
		System.out.println("String�� split()�� �̿��� ���");
		for(String token : tokens) 
			System.out.println(token);
	
		System.out.println();
		
		//���2(StringTokenizer �̿�)
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("StringTokenizer�� �̿��� ���");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
