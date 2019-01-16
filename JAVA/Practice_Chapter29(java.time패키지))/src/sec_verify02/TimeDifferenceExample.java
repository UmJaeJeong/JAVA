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
		
			System.out.println("�ѱ� ǥ�ؽ� : " + zdt);
			System.out.println("���� ǥ�ؽ� : " + zdtNY);
			
			long sec1 = zdt.getOffset().getTotalSeconds();  //������ �ʷ� ��´�.
			long sec2 = zdtNY.getOffset().getTotalSeconds(); //������ �ʷ� ��´�.
			long diff = (sec1 - sec2)/3600;  //�ð��� ��´�.
			
			System.out.println("���� ��(��) = "+sec1);
			System.out.println("���� ��(��) = "+sec2);
			System.out.print("������ " + diff + "�ð� �Դϴ�.");					
	}
}
