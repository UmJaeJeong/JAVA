package sec_verify02;

import java.text.MessageFormat;

public class StockFormatExample {

	public static void main(String[] args) {
		String[] source1 = {"����", "3����", "100", "50", "50" };
		String[] source2 = {"����", "1����", "150", "10", "140"};
		String[] source3 = {"å��", "7����", "105", "15", "90" };
		String text = "��ǰ : {0}  ����: {1}  �̿����: {2}  ����: {3}  �����: {4}";
		//��ǰ : ���� : �̿� ���: ����: �����: 
		String result = MessageFormat.format(text, source1);
		System.out.println(result);
		result = MessageFormat.format(text, source2);
		System.out.println(result);
		result = MessageFormat.format(text, source3);
		System.out.println(result);
		
	}

}
