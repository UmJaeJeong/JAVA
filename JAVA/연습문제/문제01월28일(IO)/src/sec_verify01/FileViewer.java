package sec_verify01;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileViewer {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:\\test.txt");
		int ioread = 0;
		while((ioread = is.read())!=-1) {
			System.out.print((char)ioread);
		}
		
	}

}
