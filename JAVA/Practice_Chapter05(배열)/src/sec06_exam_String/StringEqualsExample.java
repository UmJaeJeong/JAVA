package sec06_exam_String;

public class StringEqualsExample {

	public static void main(String[] args) {
		//strVar1, strVar2 ������������ ���� "���ü�" heap�Ѱ������� �����ϸ鼭,
		//���� ���� ����Ű�� �ִ� ����.
		String strVar1 = "���ü�";
		String strVar2 = "���ü�";
		
		/*
		 * Object obj1 = new Object();
		 * Object obj2 = new Object();
		 * if(!(obj1 == obj2)){
		 * 	System.out.println("1������ ����");
		 * if(!(obj1.equals(obj2))){
		 * System.out.println("2������ ����");
		 */

		//String��ü���� == ������ �ּҰ���
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		//String��ü���� equals������ �� ��
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		//new�����ڴ� �׻� ���ο� heap�޸� �Ҵ�
		String strVar3 = new String("���ü�");
		String strVar4= new String("���ü�");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
