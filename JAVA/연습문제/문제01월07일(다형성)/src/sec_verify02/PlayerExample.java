package sec_verify02;

public class PlayerExample {

	public static void main(String[] args) {
		Striker[] st = new Striker[]{
				new Striker("이동국",36,20,60,70),
				new Striker("메시",28,10,97,98)
		};
		
		for(int i=0; i<2;i++) {
			System.out.println("공격형 FW선수를 소개합니다.");
			System.out.println("이 름 :"+st[i].getName());
			System.out.println("나 이 :"+st[i].getAge());
			System.out.println("등 번호 :"+st[i].getBackNumber());
			System.out.println("스피드 :"+st[i].getSpd());
			System.out.println("유효 슛팅 :"+st[i].getShoot());
			System.out.println();
		}
		
		MidFielder md = new MidFielder("박지성",34,7,85,85);
		System.out.println("미드필더 선수를 소개합니다.");
		System.out.println("이 름 :"+md.getName());
		System.out.println("나 이 :"+md.getAge());
		System.out.println("등 번호 :"+md.getBackNumber());
		System.out.println("스피드 :"+md.getSpd());
		System.out.println("유효 슛팅 :"+md.getPass());

		System.out.println();

		Defender def = new Defender("김영권",31,33,80,99);
		System.out.println("수비수 선수를 소개합니다.");
		System.out.println("이 름 :"+def.getName());
		System.out.println("나 이 :"+def.getAge());
		System.out.println("등 번호 :"+def.getBackNumber());
		System.out.println("스피드 :"+def.getSpd());
		System.out.println("유효 슛팅 :"+def.getDef());
		System.out.println();

		Goalkeeper go = new Goalkeeper("이운재",40,25,45,99);
		System.out.println("골키퍼 선수를 소개합니다.");
		System.out.println("이 름 :"+go.getName());
		System.out.println("나 이 :"+go.getAge());
		System.out.println("등 번호 :"+go.getBackNumber());
		System.out.println("스피드 :"+go.getSpd());
		System.out.println("유효 슛팅 :"+go.getSave());
		
	}

}
