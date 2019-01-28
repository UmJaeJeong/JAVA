package sec_verify02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception{
		InputStream input = new FileInputStream("C:\\test.txt");
		OutputStream output = new FileOutputStream("C:\\test_บนป็บป.txt");
		
		String content = "";
		int input_byte = 0;
		
		while((input_byte = input.read())!=-1) {
			content+=(char)input_byte;
		}
		byte[] byte_content = content.getBytes();
		
		output.write(byte_content);
		output.flush();
		output.close();
		
	}

}
