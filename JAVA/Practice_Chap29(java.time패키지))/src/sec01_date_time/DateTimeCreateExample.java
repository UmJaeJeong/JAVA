package sec01_date_time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeCreateExample
{
	public static void main(String[] args) 
	{
		//날짜 정보만 얻기
		LocalDate currDate = LocalDate.now();  //현재 시스템의 날짜 얻기
		System.out.println("현재 날짜: " + currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);  //사용자가 직접 입력하여 LocalDate객체 생성
		System.out.println("목표 날짜: " + targetDate + "\n");

		
		
		//시간 정보만 얻기
		LocalTime currTime = LocalTime.now(); //현재 시스템의 시간 얻기
		System.out.println("현재 시간: " + currTime);
		
		LocalTime targetTime = LocalTime.of(15, 30, 30, 222);
		System.out.println("목표 시간: " + targetTime + "\n");
		
		//날짜와 시간정보 같이 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2050, 5, 10, 17, 44, 35, 2);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		
		//협정 세계시와 시간존(TimeZone)
		ZonedDateTime utcDateTime1 =   ZonedDateTime.now();
		System.out.println("협정 세계시(매개변수 주지 않을 경우): " + utcDateTime1);
		
		ZonedDateTime utcDateTime2 =   ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime2);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		
		//존아이디의 종류를 살펴보기 위한 코드
		/*String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs)
		{
			System.out.println(id);
		}*/
		
		//특정 시점의 타임스탬프(도장으로 찍는다) 얻기
		Instant instant1 = Instant.now();  //DB 로그데이터 생성시 많이 사용함.
		try 
		{
			Thread.sleep(1000);  //쓰레드의 정적 메서드 활용(이유는 이 코드가 없으면 너무 빨리 실행하므로 이 코드를 삽입함.
		}
		catch (InterruptedException e) { e.printStackTrace();	}
		
		Instant instant2 = Instant.now();		
		
		if(instant1.isBefore(instant2)) 
		{ 
			System.out.println("instant1이 빠릅니다.");
		}
		else if(instant1.isAfter(instant2)) 
		{
			System.out.println("instant1이 늦습니다.");
		}
		else 
		{
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(second): " + instant1.until(instant2, ChronoUnit.SECONDS));
		System.out.println("차이(millis): " + instant1.until(instant2, ChronoUnit.MILLIS));
		System.out.println("차이(micros): " + instant1.until(instant2, ChronoUnit.MICROS));
		System.out.println("차이(nonos): " + instant1.until(instant2, ChronoUnit.NANOS));
	}
}
