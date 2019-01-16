package sec_verify03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondSundayExample
{	
	public static void main(String[] args)
	{	
		Calendar cal = Calendar.getInstance();

		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//Date d1 = cal.getTime();
		
		//System.out.println(sdf.format(d1));
		cal.set(2016,0,1); // cal의 날짜를 2016년 1월 1일로 설정한다.
		
		//Date d2 = cal.getTime();
		//System.out.println(sdf.format(d2));
		
		for(int i=0; i < 12;i++) 
		{
			int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일을 구한다.
			
			//System.out.println(weekday);
			// 두 번째 일요일은 1일의 요일에 따라 달라진다.
			// 1일이 일요일인 경우에는 두번째 일요일은 8일이고,
			// 1일이 다른 요일일 때는 16에서 1일의 요일(weekday)을 빼면 알 수 있다.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			//System.out.println(secondSunday);
			// 두 번째 일요일(secondSunday)로 cal의 날짜(DAY_OF_MONTH)를 바꾼다.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); // Calendar를 Date로 변환한다.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
			// 날짜를 다음달 1일로 변경한다.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
	}
}
