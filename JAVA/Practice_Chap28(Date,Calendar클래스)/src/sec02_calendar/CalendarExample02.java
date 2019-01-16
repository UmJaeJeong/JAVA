package sec02_calendar;

import java.util.Calendar;

public class CalendarExample02 
{
	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance(); //싱글톤 개념 , 현재 시스템의 날짜 정보 얻기
		
		int year    = now.get(Calendar.YEAR);                
		int month  = now.get(Calendar.MONTH) + 1;          //Calendar.MONTH는 0 ~ 11을 리턴하므로 +1을 해준다.
		int day    = now.get(Calendar.DAY_OF_MONTH);     
		
		int week    = now.get(Calendar.DAY_OF_WEEK);      //요일을 얻는데 정수형태로 반환 하므로 switch문으로 요일을 설정해줌(1~7리턴)  
		String strWeek = null;
		
		switch(week) 
		{
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			default:
				strWeek = "일";
		}
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		
		if(amPm == Calendar.AM)
		{
			strAmPm = "오전";
		}
		else 
		{
			strAmPm = "오후";
		}
		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		

	}

}
