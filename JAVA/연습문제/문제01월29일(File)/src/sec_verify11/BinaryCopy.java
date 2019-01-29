package sec_verify11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) throws Exception{
		String original = new String("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg");
		String target = new String("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_output_stream\\복사본.jpg");
		File file = new File(original);
		FileInputStream fis = new FileInputStream(original);
		FileOutputStream fos = new FileOutputStream(target);
		
		int readByteNo;
		byte[] readBytes = new byte[100000];


		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
	
		fos.close();
		fis.close();
		System.out.println(file.getName()+"파일의 복사가 완료되었습니다.");
		
	}

}
