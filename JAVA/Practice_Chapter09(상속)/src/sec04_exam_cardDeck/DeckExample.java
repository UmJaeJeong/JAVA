package sec04_exam_cardDeck;

public class DeckExample {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(5);
		System.out.println("ī�� ���� �� ���� ���� �ִ� ī�� :");
		System.out.println(c.toString());
		d.shuffle();
		
		c = d.pick(0);
		System.out.println("ī�� ���� �� ���� ���� �ִ� ī�� :");
		System.out.println(c.toString());
		c = d.pick(10);
		
		System.out.println("ī�� ���� �� 11������ �ִ� ī�� :");
		System.out.println(c.toString());
		
		c = d.pick();
		System.out.println("���Ƿ� ���� ī�� :");
		System.out.println(c.toString());
		
	}

}
