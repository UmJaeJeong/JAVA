package sec_verify01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MyBirthDayExample {

	public static void main(String[] args) {
		 LocalDate birthDay = LocalDate.of(1994,07,04);
		 DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 System.out.println("���� ���� : "+birthDay.format(datetime));
		 LocalDate current = LocalDate.now();
		 System.out.println("���� : "+current.format(datetime));
		 System.out.println("�귯�� �� : "+birthDay.until(current, ChronoUnit.DAYS));
		 

	}

}
