package sec01_date_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample
{
	public static void main(String[] args) 
	{
		LocalDateTime startDateTime = LocalDateTime.of(2023,  1, 1, 7, 0, 0);  //of���� �޼��带 �̿��Ͽ�, ���� �Է�
		//LocalDateTime startDateTime = LocalDateTime.now();//���� �ý����� ��¥�� �ð� ���� ����
		System.out.println("������: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);
		System.out.println("������: " + endDateTime + "\n");
	
		//-------�� �κ�--------
		if(startDateTime.isBefore(endDateTime)) //�����̳�? 
		{
			System.out.println("������Ʈ�� ���� ���Դϴ�." + "\n");
		} 
		else if(startDateTime.isEqual(endDateTime))  //���� �ð��̳�?
		{
			System.out.println("������Ʈ�� �����մϴ�." + "\n");
		}
		else if(startDateTime.isAfter(endDateTime)) //�����̳�?
		{
			System.out.println("������Ʈ�� �����߽��ϴ�." + "\n");
		}
		
		//LocalDateTime�� until�޼��带 �̿��Ͽ� ChronoUnit�� ����Ÿ�� �����
		//�̿��Ͽ�, ��ü�� ��, ��, ��, �ð�, ��, �ʸ� ���غ���.
		System.out.println("[������� ���� �ð�]");
		System.out.println("[LocalDateTime�� until�޼��带 �̿�]");
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("���� ��: " + remainYear);
		System.out.println("���� ��: " + remainMonth);
		System.out.println("���� ��: " + remainDay);
		System.out.println("���� �ð�: " + remainHour);
		System.out.println("���� ��: " + remainMinute);
		System.out.println("���� ��: " + remainSecond + "\n");

		//ChronoUnit�� ����Ÿ�� ����� between�޼��带 �̿��Ͽ�
		//��ü�� ��, ��, ��, �ð�, ��, �ʸ� ���غ���.
		//����� LocalDateTime�� until�޼���� ����.
		System.out.println("[������� ���� �ð�]");
		System.out.println("[ChronoUnit�� ����Ÿ�� ����� between�޼��带 �̿�]");
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("���� ��: " + remainYear);
		System.out.println("���� ��: " + remainMonth);
		System.out.println("���� ��: " + remainDay);
		System.out.println("���� �ð�: " + remainHour);
		System.out.println("���� ��: " + remainMinute);
		System.out.println("���� ��: " + remainSecond + "\n");
		
		//Period�� ��¥ ������ ������ �ִ�.
		System.out.println("[������� ���� �Ⱓ]");
		System.out.println("[Period�� �����޼��� between�� �̿��Ͽ� ��¥ ���� ����]");
		
		//Period�� �����޼��� between�� �Ű�Ÿ���� LocalDateŸ���̹Ƿ� toLocalDate�޼��带 �̿��Ͽ� ��ȯ��
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("���� �Ⱓ: " + period.getYears() + "�� ");
		System.out.print(period.getMonths() + "�� ");
		System.out.println(period.getDays() + "��\n");
		//--------------------------------------------------------------
		System.out.println("[������� ���� �ð�]");
		System.out.println("[Duration�� �����޼��� between�� �̿��Ͽ� �ð� ���� ����]");
	    Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		//Duration duration = Duration.between(startDateTime, endDateTime);
		//System.out.println("���� ��: " + duration.toDays()); //�� �޼���� �ẻ���� ����.
	    //�ð��� ���� to���� Ȯ������.  8760+1440+720+11
	    System.out.println("���� �ð�: " + duration.toHours());
	    System.out.println("���� ��: " + duration.toMinutes());
	    System.out.println("���� ��: " + duration.getSeconds());
	}
}