package sec03.exam05_file_writer;

import java.io.File;
import java.io.FileWriter;

public class Filewriter {


	public static void main(String[] args) throws Exception{
		//File객체를 생성하여 FileWriter생성자 매개값으로 줌.
		//File file = new File("C:/Temp/file.txt");
		File file = new File("D:\\test.txt");
		//true가 붙어있기 떄문에 기존 파일에 append가 ㅇ된다. 없다면 덮어쓰게 된다.
		FileWriter fw = new FileWriter(file,true);
		
		fw.write("FileWriter는 한글로 된 "+"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+ "r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
		
		
	}

}
