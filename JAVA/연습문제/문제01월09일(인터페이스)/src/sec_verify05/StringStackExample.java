package sec_verify05;

public class StringStackExample {

	public static void main(String[] args) {
		StringStack ss = new StringStack(5);
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� :");
		ss.push("����");
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� :");
		ss.push("�� �����̸���");
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� :");
		ss.push("Kim");
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� :");
		ss.push("Yong");
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� :");
		ss.push("Bum");
		
		System.out.println("������ ���Լ��� �����Դϴ�.(LIFO)");
		System.out.println("���ÿ� �ִ� ������� ����մϴ�.");
		System.out.println();
		for(int i=0; i<ss.length();i++) {
			System.out.println((i+1)+"��° ���ÿ� ����� ������ ����մϴ�.");
			System.out.println(ss.pop());
		}
	}

}
