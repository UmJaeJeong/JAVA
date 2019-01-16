package sec01_format;

import java.text.MessageFormat;

public class MessageFormatExample 
{
	public static void main(String[] args) 
	{
		String id = "perpear";
		String name = "신경진";
		String tel = "010-2989-1038";
		
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}"; //패턴, ({0}, {1}, {2}가 매개변수 포맷(인덱스))
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		//DB에 저장하는 형식을 출력
		String sql = "insert into Member values( {0}, {1}, {2} )";  //패턴
		Object[] arguments = { "'java'", "'신경진'", "'010-2989-1038'" };  //배열 형태
		String result2 = MessageFormat.format(sql, arguments); //배열형태 매개값
		System.out.println(result2);

	}

}
