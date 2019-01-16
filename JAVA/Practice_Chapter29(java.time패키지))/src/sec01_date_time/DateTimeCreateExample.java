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
		//��¥ ������ ���
		LocalDate currDate = LocalDate.now();  //���� �ý����� ��¥ ���
		System.out.println("���� ��¥: " + currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);  //����ڰ� ���� �Է��Ͽ� LocalDate��ü ����
		System.out.println("��ǥ ��¥: " + targetDate + "\n");

		
		
		//�ð� ������ ���
		LocalTime currTime = LocalTime.now(); //���� �ý����� �ð� ���
		System.out.println("���� �ð�: " + currTime);
		
		LocalTime targetTime = LocalTime.of(15, 30, 30, 222);
		System.out.println("��ǥ �ð�: " + targetTime + "\n");
		
		//��¥�� �ð����� ���� ���
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2050, 5, 10, 17, 44, 35, 2);
		System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");
		
		//���� ����ÿ� �ð���(TimeZone)
		ZonedDateTime utcDateTime1 =   ZonedDateTime.now();
		System.out.println("���� �����(�Ű����� ���� ���� ���): " + utcDateTime1);
		
		ZonedDateTime utcDateTime2 =   ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: " + utcDateTime2);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð���: " + newyorkDateTime + "\n");
		
		//�����̵��� ������ ���캸�� ���� �ڵ�
		/*String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs)
		{
			System.out.println(id);
		}*/
		
		//Ư�� ������ Ÿ�ӽ�����(�������� ��´�) ���
		Instant instant1 = Instant.now();  //DB �α׵����� ������ ���� �����.
		try 
		{
			Thread.sleep(1000);  //�������� ���� �޼��� Ȱ��(������ �� �ڵ尡 ������ �ʹ� ���� �����ϹǷ� �� �ڵ带 ������.
		}
		catch (InterruptedException e) { e.printStackTrace();	}
		
		Instant instant2 = Instant.now();		
		
		if(instant1.isBefore(instant2)) 
		{ 
			System.out.println("instant1�� �����ϴ�.");
		}
		else if(instant1.isAfter(instant2)) 
		{
			System.out.println("instant1�� �ʽ��ϴ�.");
		}
		else 
		{
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(second): " + instant1.until(instant2, ChronoUnit.SECONDS));
		System.out.println("����(millis): " + instant1.until(instant2, ChronoUnit.MILLIS));
		System.out.println("����(micros): " + instant1.until(instant2, ChronoUnit.MICROS));
		System.out.println("����(nonos): " + instant1.until(instant2, ChronoUnit.NANOS));
	}
}
