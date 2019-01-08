package sec01_exam_contentSender;

public class SenderExample {

	public static void main(String[] args) {
		//추상클래스는 인스턴스를 절대로 생성을 하지 못한다.
		//ContentSender cs = new ContentSender();//예외발생 이유?
		
		//추상클래스도 조상이기때문에 다형성이 적용이 될 수 있다.
		//단, 조상클래스 선언된 추상메서드를 다 구현한 자손클래스만 대입이 가능하다.
		ContentSender cs = new letterSender("SMS문자","기모찌","4달라");
		cs.sendMsg("시무녁");
		System.out.println();
		
		letterSender ls = new letterSender("SMS문자","사공수기","방가방가");
		kakaoSender ks = new kakaoSender("카카오톡","이재훈","방가 카카오톡");
		
		//조ㅑ상클래스의 추상메서드를 오버라이딩한 메서드 호출. 각기 다른 결과를 보여줌
		ls.sendMsg("그녀1");
		System.out.println();
		ks.sendMsg("기면지");
	}

}
