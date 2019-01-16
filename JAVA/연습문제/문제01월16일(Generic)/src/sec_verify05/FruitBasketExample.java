package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		Fruit<String, Integer> f = new Fruit<>();
		Fruit<String, Integer> f1 = new Fruit<>();
		Fruit<String, Integer> f2 = new Fruit<>();

		f.setK("사과");
		f.setV(1500);
		f1.setK("귤");
		f1.setV(700);
		f2.setK("배");
		f2.setV(3700);
		System.out.println();
		
		f = FruitBasket.basketing(f, f);
		System.out.println("과일명 : "+f.getK());
		System.out.println("가격 : "+f.getV());
		f = FruitBasket.basketing(f, f1);
		System.out.println("과일명 : "+f.getK());
		System.out.println("가격 : "+f.getV());
		f = FruitBasket.basketing(f, f2);
		System.out.println("과일명 : "+f.getK());
		System.out.println("가격 : "+f.getV());

	}

}
