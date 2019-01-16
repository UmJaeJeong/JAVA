package sec_verify02;

import java.text.MessageFormat;

public class StockFormatExample 
{
	public static void main(String[] args) 
	{
		String pattern = "��ǰ: {0}  ����: {1}  �̿� ���: {2} �ȸ� ����: {3} �����: {4}" ;
		
		String[] source1 = {"����", "3����", "100", "50", "50" }; 
		String[] source2 = {"����", "1����", "150", "10", "140" };
		String[] source3 = {"å��", "7����", "105", "15", "90" };

		//pattern�� format��� MessageFormat�ν��Ͻ� ����
		MessageFormat m = new MessageFormat(pattern);
		
		//���
		System.out.println(m.format(source1));
		System.out.println(m.format(source2));
		System.out.println(m.format(source3));				
		}
}
