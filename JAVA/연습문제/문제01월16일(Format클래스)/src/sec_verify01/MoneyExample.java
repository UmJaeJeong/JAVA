package sec_verify01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class MoneyExample {

	public static void main(String[] args) {
		String data = "123,456,789.5";
		try {
			DecimalFormat df = new DecimalFormat("000,000,000.0");

			Number number = df.parse(data);
			double d = number.doubleValue();
			System.out.println("data :" + df.format(d));
			System.out.println("반올림 결과 : "+Math.round(d));
			df = new DecimalFormat("0,0000,0000");
			System.out.println("만단위 , 추가 : "+df.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
