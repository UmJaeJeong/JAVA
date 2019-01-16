package sec01_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
/*
	�ϱ�� ���� ���·δ� �� ������� �ʴ´�. LocalDateTime�� format()�޼��带
	���� �̿��Ѵ�. 	�ٵ� �Ʒ��� ���� �����ϴ� ���� �Ľ��� ����� '������ �ֱ���'
	�ϴ� ������ �����ϱ� ���ؼ���.
*/
public class DateTimeParsingExample 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter formatter = null;
		LocalDate localDate = null;
		//LocalDate localDate = LocalDate.now();
		
		//java.time.formatter.DateTimeFormatter�� ����� �����ǵǾ� ���� �߻�
		//localDate = LocalDate.parse("2018�� 10�� 08��");  
		//localDate = LocalDate.parse("2018.10.08");
		
		//DateTimeFormatter.ISO_LOCAL_DATE�� ���� �Ľ��Ͽ� LocaDate��ü�� ���ϵǹǷ� 
		//ISO_LOCAL_DATE���·� �ݵ�� ����
		System.out.println("[ISO_LOCAL_DATE���·� �Ľ���]");
		localDate = LocalDate.parse("2018-10-08"); 
				
		//�̰Ŵ� �������ִ� ����̹Ƿ� �Ľ� ��ü�� �ȵ�
		//localDate = LocalDate.parse(DateTimeFormatter.ISO_LOCAL_DATE); 
		System.out.println(localDate + "\n");
		
		//�Ʒ� 2���� DateTimeFormatter�� ����� API�� �̿��ؼ� ��Ȯ�� ���˿� �°�
		//parse�޼����� �Ű������� �־�� ���ܰ� �߻����� �ʴ´�.
		System.out.println("[DateTimeFormatter�� ��� ���·� �Ľ���]");
		formatter = DateTimeFormatter.BASIC_ISO_DATE;
		localDate = LocalDate.parse("20181008", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_OFFSET_DATE;
		localDate = LocalDate.parse("2018-10-08+01:00", formatter);
		System.out.println(localDate + "\n");
		
		//ofPattern�� ���İ� �����ϰ� parse�޼����� �Ű������� ���� ��.
		System.out.println("[DateTimeFormatter.ofPattern ���·� �Ľ���]");
		formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
		localDate = LocalDate.parse("2018�� 10�� 08��", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2018/10/08", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2018.10.08", formatter);
		System.out.println(localDate + "\n");	

		
	}
}
