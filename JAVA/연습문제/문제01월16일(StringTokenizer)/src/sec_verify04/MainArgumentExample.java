package sec_verify04;

import java.util.StringTokenizer;

public class MainArgumentExample {

	public static void main(String[] args) {
		String str = new String("����=������&ID=perpear&��������=90&��������=98&�ڹ�����=100");
		StringTokenizer st = new StringTokenizer(str,"&");
		while(st.hasMoreTokens()) {
			 String str1 = st.nextToken();
			 str1 =str1.replace("=", "  ");
			 System.out.println(str1);
		}
	}

}
