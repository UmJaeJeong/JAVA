package sec_verify04;

public class StringMetodWithExample {

	public static void main(String[] args) {
		String str = "���� �ڹٸ� �����մϴ�.";
		System.out.println("���ڿ� �Է� ==> ���� �ڹٸ� �����մϴ�.\r\n" + 
				"�Է� ���ڿ��� ���۰� ���� ���� '(' ')'�� �ƴϸ�, '(' ')'�ٿ� ����մϴ�. ");
		System.out.print("��� ���ڿ� ==>");
		if(str.startsWith("����")) {
			System.out.print("("+str);
		}
		
		if(str.endsWith(".")) {
			System.out.println(")");
		}
	}

}
