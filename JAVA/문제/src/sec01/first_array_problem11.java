package sec01;

import java.util.Scanner;

public class first_array_problem11 {
public static String change(String number) {
	if(number.equals("가위")) {
		return "바위";
	}else if(number.equals("바위")) {
		return "보";
	}else return "가위";

}

	public static void main(String[] args) {
		
		String[] code = new String[] {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		String end = "그만";
		while(true) {
			String me = sc.nextLine();
			String computer = code[(int)(Math.random()*3)];
			if(end.equals(me))break;
			if(me.equals(computer)) {
				System.out.println(me+", 비겼습니다.");
				continue;
			}
			if(me.equals(change(computer))) {
				System.out.println("사용자 = "+me+"  컴퓨터 = "+computer+" 이겼습니다.");
			}else {
				System.out.println("사용자 = "+me+"  컴퓨터 = "+computer+" 졌습니다.");
			}
		}
		System.out.println("게임을 종료합니다.");		
	}

}
