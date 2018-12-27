package sec2_verify02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean[] ko  = new Korean[2];
		ko[0] = new Korean("대한민국","김용범",178,26,"대구사투리");
		ko[1]= new Korean("USA","유재웅",172,29,"어설픈 영어");
		int i=0; 
		for(Korean k : ko) {
			if(i==0) {
				System.out.println("첫 번째 공개 수배자입니다.");
				i++;
			}else {
				System.out.println("두 번째 공개 수배자입니다.");

			}
			System.out.println("국적    :"+k.nation);
			System.out.println("이름    :"+k.name);
			System.out.println("키      :"+k.height);
			System.out.println("특징    :"+k.character);
		}
	}

}
