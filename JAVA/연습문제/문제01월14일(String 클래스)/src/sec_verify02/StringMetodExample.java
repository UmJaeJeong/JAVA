package sec_verify02;

public class StringMetodExample {

	public static void main(String[] args) {
		String a = new String("    java,");
		String b = new String("program,fighting      ");
		
		System.out.println("���ڿ� a�� ���ڿ� b�� ������ ��� :"+a+b);
		String c = a+b;
		System.out.println("���ڿ� a�� ������ ������ ��� :"+c.trim());
		System.out.println("���ڿ� a�� a�� 1�� ��ġ�� ��� :"+c.replace("a", "1"));
		String[] arr = c.trim().split(",");
		for(int i=0; i<arr.length;i++) {
			System.out.println("�и��� "+i+"�� ���ڿ�:"+arr[i]);
		}
		c =c.trim();
		c = c.replace("a", "1");
		int idx = c.indexOf("v");
		System.out.println("���ڿ� a�� substring�� ���  :"+c.substring(idx+1));
		c = c.substring(idx+1);
		System.out.println("���ڿ� a�� 2��° ���ڸ� char c�� ������ ��� :"+c.charAt(2));
	}

}
