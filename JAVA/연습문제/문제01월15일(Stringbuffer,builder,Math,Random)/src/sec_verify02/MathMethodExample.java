package sec_verify02;

public class MathMethodExample {
	
	public static void main(String[] arges) {
		double number = -2.78987434;;
		
		System.out.println("number�� ���밪 : "+Math.abs(number));
		System.out.println("number�� �ø��� : "+Math.ceil(number));
		System.out.println("number�� ������ :"+Math.floor(number));
		System.out.println("9.0 �� ������ : "+Math.sqrt(number));
		System.out.println("PI�� ����� ���� :"+Math.rint(Math.PI));
		System.out.print("�̹��� ����� �ζ� ��ȣ�� (");
		for(int i=0; i<5;i++)
			System.out.print((int)(Math.random()*44+1)+" ");
		System.out.println(")�Դϴ�.");

	}
	
}
