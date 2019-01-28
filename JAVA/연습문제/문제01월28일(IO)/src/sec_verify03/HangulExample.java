package sec_verify03;

import java.io.FileReader;
import java.io.Reader;

public class HangulExample {

	public static void main(String[] args) throws Exception{
		Reader read = new FileReader("C:\\test1.txt");
		int byte_read = 0;
		while((byte_read = read.read())!=-1) {
			System.out.print((char)byte_read);
		}
		
	}

}
