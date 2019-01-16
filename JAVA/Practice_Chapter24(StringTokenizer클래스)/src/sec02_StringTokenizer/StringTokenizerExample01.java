package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample01 {
	
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//���1: ��ü ��ū ���� ��� for������ ����(�� �Ⱦ���.)
		//���ڿ��� �ݵ�� �ϳ��� �����ڷ� �Ǿ� �־�� �Ѵ�.
		StringTokenizer st = new StringTokenizer(text, "/"); 
		int countTokens = st.countTokens();
		System.out.println("������ū�� : " + countTokens );
		
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(i + "��° ��ū : " + token);
		}		
		System.out.println();
		
		//���2: ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		//(��������� for���� ������� �ʰ� �ϱ� ����� ���� ����Ѵ�.)
		st = new StringTokenizer(text, "/");
		//������ ��ū�� �ִ���?
		while(st.hasMoreTokens()) {
			
			int count = st.countTokens();
			//���� ��ū�� ���
			System.out.println("���� ��ū�� : " + count);  
			String token = st.nextToken(); //�����Ͷ�
			System.out.println("������ ��ū �� : " + token);   
		}
	}
}
