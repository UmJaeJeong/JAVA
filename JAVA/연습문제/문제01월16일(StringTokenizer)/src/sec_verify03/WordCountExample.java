package sec_verify03;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				System.out.println("���� �� �ܾ ���ϴ� ���α׷��Դϴ�.(���� : Ctrl+Z) ");
				String st =  sc.nextLine();
				StringTokenizer str = new StringTokenizer(st," ");
				String[] str_s = new String[str.countTokens()];
				int idx = 0;
				while(str.hasMoreTokens()) {
					str_s[idx] = str.nextToken();
					System.out.println(str_s[idx]);
					idx++;			
				}
				int max = 0;
				idx =0;
				for(int i=0; i<str_s.length;i++) {
					if(max<str_s[i].length()) {
						max = str_s[i].length();
						idx = i;
					}
				}
				System.out.println("���� �� �ܾ�� "+str_s[idx]+"�Դϴ�");			
			}
		} catch (Exception e) {}

	}

}
