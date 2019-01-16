package sec01_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample
{
	public static void main(String[] args) 
	{
			LocalDateTime now = LocalDateTime.now(); //�ý����� ���� ��¥�� �ð� ���
			System.out.println(now);
					
			String strDateTime = now.getYear() + "�� ";
			strDateTime += now.getMonthValue() + "�� ";
			strDateTime += now.getDayOfMonth() + "�� ";
			
			DayOfWeek dow = now.getDayOfWeek();
			//���� ���		
			switch(dow)
			{
				case  MONDAY :
					strDateTime += "������ ";
					break;
				case  TUESDAY :
					strDateTime += "ȭ���� ";
					break;
				case  WEDNESDAY :
					strDateTime += "������ ";
					break;
				case  THURSDAY :
					strDateTime += "����� ";
					break;
				case  FRIDAY :
					strDateTime += "�ݿ��� ";
					break;
				case  SATURDAY :
					strDateTime += "����� ";
					break;
				case  SUNDAY :
					strDateTime += "�Ͽ��� ";
					break;
				
			}
			
			strDateTime += now.getHour() + "�� ";
			strDateTime += now.getMinute() + "�� ";
			strDateTime += now.getSecond() + "�� ";
			strDateTime += now.getNano() + "������";
			
			System.out.println(strDateTime + "\n");
			
			//LocalDateTimeŬ�������� isLeapYear()�� ��� toLocalDate()�޼��带 �̿��ؼ� ��ȯ��Ű��
			//���� ������ �򵵷� �Ѵ�.
			LocalDate nowDate = now.toLocalDate(); 
			
			if(nowDate.isLeapYear()) 
			{
				System.out.println("���ش� ����: 2���� 29�ϱ��� �ֽ��ϴ�.\n");
			} 
			else
			{
				System.out.println("���ش� ���: 2���� 28�ϱ��� �ֽ��ϴ�.\n");
			}
			
			//���� ����ÿ� ��������
			ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("���� �����: " + utcDateTime);
			ZonedDateTime seoulDateTime =  ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println("���� Ÿ����: " + seoulDateTime);
			ZoneId seoulZoneId = seoulDateTime.getZone();
			System.out.println("���� �����̵�: " + seoulZoneId);
			ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
			System.out.println("���� ��������: " + seoulZoneOffset + "\n");
	}
}