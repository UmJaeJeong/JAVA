package sec_verify04;

public class NatinoExample {

	public static void main(String[] args) {
		Korea ko = new Korea();
		China ch = new China();
		
		System.out.printf("내가 살고 있는 나라 : %s이며,내 나라는 %s에 속합니다.%n",ch.country,ch.toString());
		System.out.printf("내가 살고 있는 나라 : %s이며,내 나라는 %s에 속합니다.",ko.country,ko.toString());

	}

}
