package sec_verify01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MyBirthDayExample {

	public static void main(String[] args) {
		 LocalDate birthDay = LocalDate.of(1994,07,04);
		 DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 System.out.println("나의 생일 : "+birthDay.format(datetime));
		 LocalDate current = LocalDate.now();
		 System.out.println("금일 : "+current.format(datetime));
		 System.out.println("흘러간 날 : "+birthDay.until(current, ChronoUnit.DAYS));
		 

	}

}
