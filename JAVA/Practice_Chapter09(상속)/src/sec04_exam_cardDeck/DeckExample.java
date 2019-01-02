package sec04_exam_cardDeck;

public class DeckExample {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(5);
		System.out.println("카드 섞기 전 제일 위에 있는 카드 :");
		System.out.println(c.toString());
		d.shuffle();
		
		c = d.pick(0);
		System.out.println("카드 섞은 후 제일 위에 있는 카드 :");
		System.out.println(c.toString());
		c = d.pick(10);
		
		System.out.println("카드 섞은 후 11번쨰에 있는 카드 :");
		System.out.println(c.toString());
		
		c = d.pick();
		System.out.println("임의로 뽑은 카드 :");
		System.out.println(c.toString());
		
	}

}
