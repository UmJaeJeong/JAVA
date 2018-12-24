package sec02_exam;

public class TvTestExample3 {
	
	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		int i=0;
		
		//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
			System.out.println(tvArr[i].channel);
		}
		
		for(i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();// tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel=%2d %n",i,tvArr[i].channel);
		}
		System.out.println();
		//향상된 for문
		//가져올 타입 : 가져올 장소
		
		for(Tv tv : tvArr) {
			tv = new Tv();
			tv.channel = 10;
			System.out.println(tv.channel);

		}
	}
}
