package sec01_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now(); //현재 시스템의 날짜와 시간을 얻는다.
		
		//사용자의 용도대로 formatter의 형태로 지정하면 됨.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy년 MM월 dd일 E요일 a h시 mm분");
		
		String nowString = now.format(formatter);
		
		System.out.println("[LocalDateTime의 format()메서드를 이용하여 출력함]");
		System.out.println(nowString);
	}
}
