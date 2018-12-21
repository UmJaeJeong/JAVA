package sec05_exam_enum;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		//Calendar클래스의 인스턴스를 리턴 받음.(싱글톤 패턴)
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//일(1)~~토(7)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);//0~11
		
		//cal.get(Calenar.)
		//일, 요일, 시간, 분, 초 역시 위와 같은 방법으로 얻을 수있다. API를 확인해보자
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("올해는 "+year);
		System.out.println("월은 "+(month+1));
		System.out.println("현재 분은 "+minute);
		
		//week는 1~7까지의 정수값을 가지고 있따.
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.THUSDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;	
		}
		
		System.out.println("오늘 요일: "+today);
		if(today == Week.SUNDAY|| today == Week.SATURDAY) {
			System.out.println("토, 일에는 열심히 소주를 마십니다.");

		}else {
			System.out.println("열심히 자바 공부를 합니다.");

		}

	}

}
