package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Audio,Monitor> p1 = new Product<>();
		p1.setA(new Audio("Sony","�ֻ�",4));
		p1.setM(new Monitor("�Ｚ",17));
		System.out.println("�� ������� "+p1.getA().getBrand()+" �������̸�, ������ "+p1.getA().getQuality()+" �̸�,"+p1.getA().getChannel()+"ä���̴�.");
		System.out.println("������� ��");
		System.out.println("�귣�� : "+p1.getM().getCompany());
		System.out.println("��ġ   : "+p1.getM().getInch());
		System.out.println("����   : 350000");
	
	}

}
