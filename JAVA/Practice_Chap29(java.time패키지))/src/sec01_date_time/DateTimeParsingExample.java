package sec01_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
/*
	하기와 같은 형태로는 잘 사용하지 않는다. LocalDateTime의 format()메서드를
	많이 이용한다. 	근데 아래와 같이 연습하는 것은 파싱의 개념과 '저런게 있구나'
	하는 정도를 설명하기 위해서다.
*/
public class DateTimeParsingExample 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter formatter = null;
		LocalDate localDate = null;
		//LocalDate localDate = LocalDate.now();
		
		//java.time.formatter.DateTimeFormatter의 상수로 미정의되어 예외 발생
		//localDate = LocalDate.parse("2018년 10월 08일");  
		//localDate = LocalDate.parse("2018.10.08");
		
		//DateTimeFormatter.ISO_LOCAL_DATE의 형태 파싱하여 LocaDate객체로 리턴되므로 
		//ISO_LOCAL_DATE형태로 반드시 지정
		System.out.println("[ISO_LOCAL_DATE형태로 파싱함]");
		localDate = LocalDate.parse("2018-10-08"); 
				
		//이거는 정해저있는 상수이므로 파싱 자체가 안됨
		//localDate = LocalDate.parse(DateTimeFormatter.ISO_LOCAL_DATE); 
		System.out.println(localDate + "\n");
		
		//아래 2개의 DateTimeFormatter의 상수를 API를 이용해서 정확한 포맷에 맞게
		//parse메서드의 매개값으로 주어야 예외가 발생하지 않는다.
		System.out.println("[DateTimeFormatter의 상수 형태로 파싱함]");
		formatter = DateTimeFormatter.BASIC_ISO_DATE;
		localDate = LocalDate.parse("20181008", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_OFFSET_DATE;
		localDate = LocalDate.parse("2018-10-08+01:00", formatter);
		System.out.println(localDate + "\n");
		
		//ofPattern의 형식과 동일하게 parse메서드의 매개값으로 줘어야 함.
		System.out.println("[DateTimeFormatter.ofPattern 형태로 파싱함]");
		formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		localDate = LocalDate.parse("2018년 10월 08일", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2018/10/08", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2018.10.08", formatter);
		System.out.println(localDate + "\n");	

		
	}
}
