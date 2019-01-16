package sec01_date_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����: " + now);
		
		LocalDateTime  targetDateTime = null;
		
		//���� ����
		targetDateTime = now
			.withYear(2024)
			.withMonth(7)
			.withDayOfMonth(5)
			.withHour(13)
			.withMinute(30)
			.withSecond(20);
		System.out.println("���� ����: " + targetDateTime + "\n");
		
		//�⵵ ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("�̹� ���� ù ��: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("�̹� ���� ������ ��: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("���� ���� ù ��: " + targetDateTime + "\n");
		
		//�� ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� ���� ù ��: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹� ���� ������ ��: " + targetDateTime + "\n");
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("���� ���� ù ��: " + targetDateTime + "\n");
			
		//���� ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
		System.out.println("�̹� ���� ù �����: " + targetDateTime + "\n");
		
		//������ �������� �ʴ� �޼���
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("���ƿ��� �����(���� ������): " + targetDateTime + "\n");
		
		//������ �����ϴ� �޼���
		targetDateTime = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
		System.out.println("���ƿ��� �����(���� ����): " + targetDateTime + "\n");
		
		//������ �������� �ʴ� �޼���
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("���� �����(���� ������): " + targetDateTime + "\n");
		
		//������ �����ϴ� �޼���
		targetDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
		System.out.println("���� �����(���� ����): " + targetDateTime + "\n");
	}
}
