package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		StringTokenizer st = new StringTokenizer(str,",");
		
		
		System.out.println("String�� split()�� �̿��� ���");
		String[] sp = str.split(",");
		for(int i=0; i<sp.length;i++)
			System.out.println(sp[i]);

		System.out.println();
		System.out.println("StringTokenizer�� �̿��� ���");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
