package sec01_firstArray;

public class Array_Example02 extends Object{

	public static void main(String[] args) {
		int sum =0;//총점을 저장하기위한 변수
		float average = 0.0f;//컴파일 에러뜬다. 이유는?
		
		//선언과 동시에 초기화
		int[] score = new int[] {100,88,100,100,90};
		
		System.out.println("배열의 길이 : "+score.length);
		
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
		}
		
		//계산결과를 flaot로 얻기위함
		average = sum/(float)score.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);

	}

}
