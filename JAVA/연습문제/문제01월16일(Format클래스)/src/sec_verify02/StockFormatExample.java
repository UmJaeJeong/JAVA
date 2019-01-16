package sec_verify02;

import java.text.MessageFormat;

public class StockFormatExample {

	public static void main(String[] args) {
		String[] source1 = {"의자", "3만원", "100", "50", "50" };
		String[] source2 = {"베개", "1만원", "150", "10", "140"};
		String[] source3 = {"책상", "7만원", "105", "15", "90" };
		String text = "제품 : {0}  가격: {1}  이월재고: {2}  수량: {3}  현재고: {4}";
		//제품 : 가격 : 이월 재고: 수량: 현재고: 
		String result = MessageFormat.format(text, source1);
		System.out.println(result);
		result = MessageFormat.format(text, source2);
		System.out.println(result);
		result = MessageFormat.format(text, source3);
		System.out.println(result);
		
	}

}
