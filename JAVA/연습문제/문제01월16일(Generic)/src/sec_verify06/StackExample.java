package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>(10);
		s.push("���");
		s.push("����");
		s.push("����");
		s.push("â��");
		s.push("����");
		s.push("��ǳ");
		s.push("�뱸");
		s.push("����");
		s.push("�λ�");
		s.push("����");
		
		
		System.out.println();
		System.out.println("intStack�� push��  ��ü�� pop()�� ���� ������½��ϴ�");
		for(int i=1; i<=10;i++) {
			System.out.println(s.tos+"��° ��ü �� : "+s.pop());
		}
		
		s.push("-55");
		s.push("1005");
		s.push("665");
		s.push("528");
		s.push("770");
		s.push("150");
		s.push("301");
		s.push("111");
		
		

		

	}

}
