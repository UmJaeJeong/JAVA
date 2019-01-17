package sec_verify02;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeDifferenceExample {

	public static void main(String[] args) {
		ZonedDateTime New_York = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime korea = ZonedDateTime.now();
		
		System.out.println("한국 표준시 : " + korea);
		System.out.println("뉴욕 표준시 : " + New_York);
		
		System.out.println("서울 존(초) = "+korea.getOffset().getTotalSeconds());
		System.out.println("뉴욕 존(초) = "+New_York.getOffset().getTotalSeconds());
		long hour_offset = (korea.getOffset().getTotalSeconds() -New_York.getOffset().getTotalSeconds())/3600;
		System.out.println("시차는 "+hour_offset+"시간 입니다.");
	}

}
