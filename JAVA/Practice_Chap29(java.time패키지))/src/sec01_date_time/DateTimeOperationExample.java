package sec01_date_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시: " + now);
		
		LocalDateTime  targetDateTime = now.plusYears(5L); 
		//LocalDateTime targetDateTime2 = now.plusMonths(5);
		targetDateTime = targetDateTime.plusMonths(1L);
		targetDateTime = targetDateTime.plusDays(10L);
		targetDateTime = targetDateTime.plusHours(5L);
		targetDateTime = targetDateTime.plusMinutes(30L);
		targetDateTime = targetDateTime.plusSeconds(18L);
		targetDateTime = targetDateTime.plusNanos(10L);
		
		//간단한 방법(위와 동일한 결과값을 반영함)		
	/*	LocalDateTime  targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);*/
		
		System.out.println("연산후: " + targetDateTime);
	}
}
