//Practice_Chap28(Date,CalendarŬ����)
package sec01_date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		//DateŬ������ Time-Stamp������� ���� ����Ѵ�.
		Date now = new Date();  //���� �ý����� ��¥�� �ð��� ����
		String strNow1 = now.toString();	
		//KST(�ѱ�ǥ�ؽ�)
		System.out.println(strNow1);
		
		//DateŬ������ ���� �ν��Ͻ� ������ SimpleDateFormatŬ������ format()��
		//�̿��ؼ� ���ϴ� ���·� ����Ҽ� �ִ�.
		SimpleDateFormat sdf = new SimpleDateFormat
								("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	

	
	}
}
