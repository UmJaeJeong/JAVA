package sec01_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now(); //���� �ý����� ��¥�� �ð��� ��´�.
		
		//������� �뵵��� formatter�� ���·� �����ϸ� ��.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy�� MM�� dd�� E���� a h�� mm��");
		
		String nowString = now.format(formatter);
		
		System.out.println("[LocalDateTime�� format()�޼��带 �̿��Ͽ� �����]");
		System.out.println(nowString);
	}
}
