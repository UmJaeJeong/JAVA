package sec01_date_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample
{
	public static void main(String[] args) 
	{
		LocalDateTime startDateTime = LocalDateTime.of(2023,  1, 1, 7, 0, 0);  //of정적 메서드를 이용하여, 직접 입력
		//LocalDateTime startDateTime = LocalDateTime.now();//현재 시스템의 날짜와 시간 정보 얻음
		System.out.println("시작일: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);
		System.out.println("종료일: " + endDateTime + "\n");
	
		//-------비교 부분--------
		if(startDateTime.isBefore(endDateTime)) //이전이냐? 
		{
			System.out.println("프로젝트를 진행 중입니다." + "\n");
		} 
		else if(startDateTime.isEqual(endDateTime))  //같은 시각이냐?
		{
			System.out.println("프로젝트를 종료합니다." + "\n");
		}
		else if(startDateTime.isAfter(endDateTime)) //이후이냐?
		{
			System.out.println("프로젝트를 종료했습니다." + "\n");
		}
		
		//LocalDateTime의 until메서드를 이용하여 ChronoUnit의 열거타입 상수를
		//이용하여, 전체의 년, 달, 일, 시간, 분, 초를 구해본다.
		System.out.println("[종료까지 남은 시간]");
		System.out.println("[LocalDateTime의 until메서드를 이용]");
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");

		//ChronoUnit의 열거타입 상수의 between메서드를 이용하여
		//전체의 년, 달, 일, 시간, 분, 초를 구해본다.
		//결과는 LocalDateTime의 until메서드와 같다.
		System.out.println("[종료까지 남은 시간]");
		System.out.println("[ChronoUnit의 열거타입 상수의 between메서드를 이용]");
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		
		//Period는 날짜 정보만 가지고 있다.
		System.out.println("[종료까지 남은 기간]");
		System.out.println("[Period의 정적메서드 between을 이용하여 날짜 정보 얻음]");
		
		//Period의 정적메서드 between의 매개타입은 LocalDate타입이므로 toLocalDate메서드를 이용하여 변환함
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간: " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "달 ");
		System.out.println(period.getDays() + "일\n");
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		System.out.println("[Duration의 정적메서드 between을 이용하여 시간 정보 얻음]");
	    Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		//Duration duration = Duration.between(startDateTime, endDateTime);
		//System.out.println("남은 날: " + duration.toDays()); //이 메서드는 써본적이 없다.
	    //시간과 분의 to임을 확인하자.  8760+1440+720+11
	    System.out.println("남은 시간: " + duration.toHours());
	    System.out.println("남은 분: " + duration.toMinutes());
	    System.out.println("남은 초: " + duration.getSeconds());
	}
}