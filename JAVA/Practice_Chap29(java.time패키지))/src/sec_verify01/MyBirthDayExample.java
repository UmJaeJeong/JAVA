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
		
		System.out.println("���� ���� : "+birthDay);
		
		System.out.println("���� : "+now);
		
		System.out.println("�귯�� �� : " + days + "��");

	}

}
