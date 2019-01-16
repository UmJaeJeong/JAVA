package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {
		Bowl<String, String> b1 = new Bowl<>();
		b1.setK("박근혜");
		b1.setV("대통령");
		System.out.println("이름 : "+b1.getK());
		System.out.println("직업 : "+b1.getV());
		
		Bowl<String, Integer> b2 = new Bowl<>();
		b2.setK("박근혜");
		b2.setV(65);
		System.out.println("이름 : "+b2.getK());
		System.out.println("나이 : "+b2.getV());
	}

}
