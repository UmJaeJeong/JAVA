package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {
		Bowl<String, String> b1 = new Bowl<>();
		b1.setK("�ڱ���");
		b1.setV("�����");
		System.out.println("�̸� : "+b1.getK());
		System.out.println("���� : "+b1.getV());
		
		Bowl<String, Integer> b2 = new Bowl<>();
		b2.setK("�ڱ���");
		b2.setV(65);
		System.out.println("�̸� : "+b2.getK());
		System.out.println("���� : "+b2.getV());
	}

}
