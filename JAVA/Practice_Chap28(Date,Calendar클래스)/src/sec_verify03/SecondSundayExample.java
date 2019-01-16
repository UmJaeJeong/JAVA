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
		cal.set(2016,0,1); // cal�� ��¥�� 2016�� 1�� 1�Ϸ� �����Ѵ�.
		
		//Date d2 = cal.getTime();
		//System.out.println(sdf.format(d2));
		
		for(int i=0; i < 12;i++) 
		{
			int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1���� ������ ���Ѵ�.
			
			//System.out.println(weekday);
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8���̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ����(weekday)�� ���� �� �� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			//System.out.println(secondSunday);
			// �� ��° �Ͽ���(secondSunday)�� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); // Calendar�� Date�� ��ȯ�Ѵ�.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			// ��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
	}
}
