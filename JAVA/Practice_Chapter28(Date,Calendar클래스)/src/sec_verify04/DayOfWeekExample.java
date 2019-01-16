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
			String pattern2 = "입력하신 날짜는 E요일입니다."; // 'E'는 일~토 중의 하나가 된다.
			DateFormat df = new SimpleDateFormat(pattern);
			DateFormat df2 = new SimpleDateFormat(pattern2);
			Scanner s = new Scanner(System.in);
			Date inDate = null;
			
			do
			{
				System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력 예 : 2016/01/01)");
				try 
				{
					System.out.print(">>");
					inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.
					break; // parse()에서 예외가 발생하면 이 문장은 수행되지 않는다.
				}
				catch(Exception e) 
				{
					System.out.print("예외 발생 -> ");
				}
			} while(true);
			
			System.out.println(df2.format(inDate));
			s.close();
	}
}
