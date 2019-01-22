package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeThread extends Thread {
	@Override
	public void run() {
		
		while (true) {
			long time = System.currentTimeMillis();
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String str = dayTime.format(new Date(time));
			try {
				System.out.println("오늘 날짜 및 시간 : "+str);
				Thread.sleep(1000);

			} catch (Exception e) {				
				System.out.println("데몬 스레드인 dateTimeThread가 종료됩니다.");
				break;

			}
		}
	}
}
