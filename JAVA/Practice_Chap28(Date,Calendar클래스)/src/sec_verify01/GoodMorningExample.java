package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
	
		System.out.println("지금은 " + hourOfDay + "시 " + minute + "분입니다.");
		
		if(hourOfDay > 4 && hourOfDay < 12) 
			System.out.println("오전이네요!! Good Morning");		
		else if(hourOfDay >= 12 && hourOfDay < 18) 
			System.out.println("오후군요! 쩝. Good Afternoon");
		else if(hourOfDay >= 18 && hourOfDay < 22) 
			System.out.println("저녁이네요!! Good Evening");
		else
			System.out.println("안녕히 주무세요~! Good Night");			
	}

}
