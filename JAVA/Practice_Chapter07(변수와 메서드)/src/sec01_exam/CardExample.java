package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		//static은 인스턴스 생서없이도 접근 가능
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		//c1인스턴스를 생성
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		//c2인스턴스를 ㅐㅅㅇ성
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number +"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number +"이며, 크기는 ("+c2.width+","+c2.height+")");
		
		System.out.println("c1은 "+c2.kind+", "+c2.number +"이며, 크기는 ("+Card.width+","+Card.height+")");
		
		
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		c1.width = 50;//warning이 뜬다. 이유? static변수이기 때문에 객체로 접근하여 수정하면 안된다. 공통으로 사용하는 크기이므로
		c1.height = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number +"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number +"이며, 크기는 ("+c2.width+","+c2.height+")");
		

	}

}
