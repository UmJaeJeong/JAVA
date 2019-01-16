package sec_verify04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfWeekExample
{	
	public static void main(String[] args)
	{			
			String pattern = "yyyy/MM/dd";
			String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�."; // 'E'�� ��~�� ���� �ϳ��� �ȴ�.
			DateFormat df = new SimpleDateFormat(pattern);
			DateFormat df2 = new SimpleDateFormat(pattern2);
			Scanner s = new Scanner(System.in);
			Date inDate = null;
			
			do
			{
				System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է� �� : 2016/01/01)");
				try 
				{
					System.out.print(">>");
					inDate = df.parse(s.nextLine()); // �Է¹��� ��¥�� Date�� ��ȯ�Ѵ�.
					break; // parse()���� ���ܰ� �߻��ϸ� �� ������ ������� �ʴ´�.
				}
				catch(Exception e) 
				{
					System.out.print("���� �߻� -> ");
				}
			} while(true);
			
			System.out.println(df2.format(inDate));
			s.close();
	}
}
