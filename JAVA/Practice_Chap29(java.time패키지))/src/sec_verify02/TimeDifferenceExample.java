package sec_verify02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDifferenceExample
{
	public static void main(String[] args) 
	{
			ZonedDateTime zdt = ZonedDateTime.now();
			ZoneId nyId = ZoneId.of("America/New_York");
			ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);
		
			System.out.println("한국 표준시 : " + zdt);
			System.out.println("뉴욕 표준시 : " + zdtNY);
			
			long sec1 = zdt.getOffset().getTotalSeconds();  //시차를 초로 얻는다.
			long sec2 = zdtNY.getOffset().getTotalSeconds(); //시차를 초로 얻는다.
			long diff = (sec1 - sec2)/3600;  //시간을 얻는다.
			
			System.out.println("서울 존(초) = "+sec1);
			System.out.println("뉴욕 존(초) = "+sec2);
			System.out.print("시차는 " + diff + "시간 입니다.");					
	}
}
