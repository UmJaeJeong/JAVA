package sec_verify01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyBirthDayExample
{
	public static void main(String[] args) 
	{
		LocalDate birthDay = LocalDate.of(1978, 11, 25);
		LocalDate now = LocalDate.now();
		long days = birthDay.until(now, ChronoUnit.DAYS);
		
		System.out.println("나의 생일 : "+birthDay);
		
		System.out.println("금일 : "+now);
		
		System.out.println("흘러간 날 : " + days + "일");

	}

}
