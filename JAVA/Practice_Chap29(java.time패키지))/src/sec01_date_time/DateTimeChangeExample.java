package sec01_date_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime  targetDateTime = null;
		
		//직접 변경
		targetDateTime = now
			.withYear(2024)
			.withMonth(7)
			.withDayOfMonth(5)
			.withHour(13)
			.withMinute(30)
			.withSecond(20);
		System.out.println("직접 변경: " + targetDateTime + "\n");
		
		//년도 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일: " + targetDateTime + "\n");
		
		//월 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일: " + targetDateTime + "\n");
			
		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
		System.out.println("이번 달의 첫 목요일: " + targetDateTime + "\n");
		
		//오늘을 포함하지 않는 메서드
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("돌아오는 목요일(오늘 미포함): " + targetDateTime + "\n");
		
		//오늘을 포함하는 메서드
		targetDateTime = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		System.out.println("돌아오는 목요일(오늘 포함): " + targetDateTime + "\n");
		
		//오늘을 포함하지 않는 메서드
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("지난 목요일(오늘 미포함): " + targetDateTime + "\n");
		
		//오늘을 포함하는 메서드
		targetDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
		System.out.println("지난 목요일(오늘 포함): " + targetDateTime + "\n");
	}
}
