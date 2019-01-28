package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("D:\\test.txt");
		char[] data = "홍길동".toCharArray();		//문자열을 문자배열로 리턴
		
		for(int i = 0; i < data.length; i++) {
			//write()를 호출하고 예외가 발생치 않았다면, 정상적으로 실행이 된것을 알수있다.
			writer.write(data[i]);
			System.out.println("루핑수 : " + i);	//총, 3번이 루핑된다.
		}
		writer.flush();	//강제로 버퍼 비움
		writer.close();	//자원 해제
	}

}
