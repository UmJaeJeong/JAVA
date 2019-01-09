package sec02_exam_ParserExample;

public class ParserManager {
	/*
	 * main()이 static이므로 static으로 선언해야한다.
	 * 아울러 리턴타입이 인터페이스 타입이라는 것은 그 인터페이스를
	 * 구현한 클ㄹ매스에 한해서 인스턴스를 반환하겠다는 의미이다.
	 * 
	 */
	
	public static Parserable getParser(String type) {
		//String의 equals는 값 비교한다.
		//객체의 비교는 기본적으로 주소비교이다.
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			//인터페이스 필드의 다형성
			Parserable p = new HTMLParser();
			return p ;
			//return new HTMLPArser();
		}
		
	}
}
