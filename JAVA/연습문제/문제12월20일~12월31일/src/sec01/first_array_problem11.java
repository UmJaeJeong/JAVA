package sec01;

import java.util.Scanner;

public class first_array_problem11 {
public static String change(String number) {
	if(number.equals("����")) {
		return "����";
	}else if(number.equals("����")) {
		return "��";
	}else return "����";

}

	public static void main(String[] args) {
		
		String[] code = new String[] {"����","����","��"};
		Scanner sc = new Scanner(System.in);
		String end = "�׸�";
		while(true) {
			String me = sc.nextLine();
			String computer = code[(int)(Math.random()*3)];
			if(end.equals(me))break;
			if(me.equals(computer)) {
				System.out.println(me+", �����ϴ�.");
				continue;
			}
			if(me.equals(change(computer))) {
				System.out.println("����� = "+me+"  ��ǻ�� = "+computer+" �̰���ϴ�.");
			}else {
				System.out.println("����� = "+me+"  ��ǻ�� = "+computer+" �����ϴ�.");
			}
		}
		System.out.println("������ �����մϴ�.");		
	}

}
