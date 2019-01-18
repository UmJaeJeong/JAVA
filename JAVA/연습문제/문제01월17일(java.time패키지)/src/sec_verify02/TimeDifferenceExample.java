package sec_verify02;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeDifferenceExample {

	public static void main(String[] args) {
		ZonedDateTime New_York = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime korea = ZonedDateTime.now();
		
		System.out.println("�ѱ� ǥ�ؽ� : " + korea);
		System.out.println("���� ǥ�ؽ� : " + New_York);
		
		System.out.println("���� ��(��) = "+korea.getOffset().getTotalSeconds());
		System.out.println("���� ��(��) = "+New_York.getOffset().getTotalSeconds());
		long hour_offset = (korea.getOffset().getTotalSeconds() -New_York.getOffset().getTotalSeconds())/3600;
		System.out.println("������ "+hour_offset+"�ð� �Դϴ�.");
	}

}
