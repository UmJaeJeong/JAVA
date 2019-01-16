package sec_verify02;

import java.text.MessageFormat;

public class StockFormatExample 
{
	public static void main(String[] args) 
	{
		String pattern = "제품: {0}  가격: {1}  이월 재고: {2} 팔린 수량: {3} 현재고: {4}" ;
		
		String[] source1 = {"의자", "3만원", "100", "50", "50" }; 
		String[] source2 = {"베개", "1만원", "150", "10", "140" };
		String[] source3 = {"책상", "7만원", "105", "15", "90" };

		//pattern의 format대로 MessageFormat인스턴스 생성
		MessageFormat m = new MessageFormat(pattern);
		
		//출력
		System.out.println(m.format(source1));
		System.out.println(m.format(source2));
		System.out.println(m.format(source3));				
		}
}
