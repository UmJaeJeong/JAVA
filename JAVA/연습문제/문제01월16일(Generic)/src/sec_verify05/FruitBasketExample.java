package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		Fruit<String, Integer> f = new Fruit<>();
		Fruit<String, Integer> f1 = new Fruit<>();
		Fruit<String, Integer> f2 = new Fruit<>();

		f.setK("���");
		f.setV(1500);
		f1.setK("��");
		f1.setV(700);
		f2.setK("��");
		f2.setV(3700);
		System.out.println();
		
		f = FruitBasket.basketing(f, f);
		System.out.println("���ϸ� : "+f.getK());
		System.out.println("���� : "+f.getV());
		f = FruitBasket.basketing(f, f1);
		System.out.println("���ϸ� : "+f.getK());
		System.out.println("���� : "+f.getV());
		f = FruitBasket.basketing(f, f2);
		System.out.println("���ϸ� : "+f.getK());
		System.out.println("���� : "+f.getV());

	}

}
