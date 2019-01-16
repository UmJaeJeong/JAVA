package sec01_format;

import java.text.MessageFormat;

public class MessageFormatExample 
{
	public static void main(String[] args) 
	{
		String id = "perpear";
		String name = "�Ű���";
		String tel = "010-2989-1038";
		
		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}"; //����, ({0}, {1}, {2}�� �Ű����� ����(�ε���))
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		//DB�� �����ϴ� ������ ���
		String sql = "insert into Member values( {0}, {1}, {2} )";  //����
		Object[] arguments = { "'java'", "'�Ű���'", "'010-2989-1038'" };  //�迭 ����
		String result2 = MessageFormat.format(sql, arguments); //�迭���� �Ű���
		System.out.println(result2);

	}

}
