package sec03.exam05_file_writer;

import java.io.File;
import java.io.FileWriter;

public class Filewriter {


	public static void main(String[] args) throws Exception{
		//File��ü�� �����Ͽ� FileWriter������ �Ű������� ��.
		//File file = new File("C:/Temp/file.txt");
		File file = new File("D:\\test.txt");
		//true�� �پ��ֱ� ������ ���� ���Ͽ� append�� ���ȴ�. ���ٸ� ����� �ȴ�.
		FileWriter fw = new FileWriter(file,true);
		
		fw.write("FileWriter�� �ѱ۷� �� "+"\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�."+ "r\n");
		
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
		
		
		
	}

}
