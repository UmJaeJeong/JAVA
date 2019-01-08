package sec_verify07;

public class BuyerExample {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		
		buyer.summary();


	}

}
