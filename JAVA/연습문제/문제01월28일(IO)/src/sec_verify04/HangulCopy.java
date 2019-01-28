package sec_verify04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class HangulCopy {

	public static void main(String[] args) throws Exception{
		Reader read = new FileReader("C:\\test1.txt");
		Writer writer = new FileWriter("C:\\test1_บนป็บป.txt");
		int n_read = 0;
		String content = "";
		while((n_read = read.read())!=-1) {
			content += (char)n_read;
		}
		//byte[] by_read = content.getBytes();
		writer.write(content);
		writer.flush();
		writer.close();
	}

}
