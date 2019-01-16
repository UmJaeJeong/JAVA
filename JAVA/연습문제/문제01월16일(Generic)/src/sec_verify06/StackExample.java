package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>(10);
		s.push("고양");
		s.push("용인");
		s.push("마산");
		s.push("창녕");
		s.push("구지");
		s.push("현풍");
		s.push("대구");
		s.push("광주");
		s.push("부산");
		s.push("서울");
		
		
		System.out.println();
		System.out.println("intStack에 push된  객체를 pop()을 통해 꺼집어냈습니다");
		for(int i=1; i<=10;i++) {
			System.out.println(s.tos+"번째 객체 값 : "+s.pop());
		}
		
		s.push("-55");
		s.push("1005");
		s.push("665");
		s.push("528");
		s.push("770");
		s.push("150");
		s.push("301");
		s.push("111");
		
		

		

	}

}
