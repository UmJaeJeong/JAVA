package sec_verify05;

public class CircleExample {

	public static void main(String[] args) {
		 Circle[] c =new Circle[] {
				 new Circle(1,2,10), new Circle(5,6,10)
		 };
		 
		 int i=1;
		 for(Circle a : c) {
			 System.out.println("��"+i+" "+a);
			 i++;
		 }
		 
		 if(c[0].equals(c[1])) {
			 System.out.println("�� 1�� �� 2�� ���� ���Դϴ�.");
		 }else {
			 System.out.println("�� 1�� �� 2�� �ٸ� ���Դϴ�.");

		 }
	}

}
