package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, Double>���� ��ü ���� �� ���尪 �ҷ�����");
		SmartPhone<String,String,Double> s1 = new SmartPhone<>();
		s1.setCompany("Samsung");
		s1.setModel("������5");
		s1.setInch(5.5);
		System.out.println("ȸ�� : "+s1.getCompany());
		System.out.println("�� : "+s1.getModel());
		System.out.println("��ġ : "+s1.getInch());

		System.out.println();
		
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, String>���� ��ü ���� �� ���尪 �ҷ�����");

		SmartPhone<String,String,String> s2 = new SmartPhone<>();
		s2.setCompany("LG����");
		s2.setModel("V20");
		s2.setInch("6.0");
		System.out.println("ȸ�� : "+s2.getCompany());
		System.out.println("�� : "+s2.getModel());
		System.out.println("��ġ : "+s2.getInch());
		

	}

}
