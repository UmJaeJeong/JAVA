package sec03.exam03_file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// 파잉을 복사하기 위해 위의 경로로 수정
		String originalFileName = "D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg";
		String targetFileName = "c:/Temp/노맛점.jpg";
		File file = new File(originalFileName);

		// FileInputStream,FileOutputStream을 얻어서 경로를 준다.
		// 복사는 동영상, 문자파일, 그림파일 음악파일 등 다 바이트기반으로 되어있기 때문에 가능하다.
		// 하지만, Reader와 Writer은 문자파일만 가능하게끔 특화되어 있다.
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		int i = 0;
		// 바이트배열을 크게잡을수록 복사시간이 빨라진다.
		// byte[] readBytes = new byte[10000];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis(); // 현재 시점을 저장한다.

		// 100바이트만큼 읽고 루핑한다.
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
			i++;
		}
		fos.flush();// 강제로 버퍼를 비워준다
		long endTime = System.currentTimeMillis(); // 끝난 시점
		System.out.println("루핑수 : "+i+"\t복사시간"+(endTime-currentTime)+
				"ms"+"\t복사한 파일의 크기 :"+file.length()/1024+"Kbyte");
		
		fos.close();
		fis.close();
		System.out.println(file.getName()+"파일의 복사가 완료되었습니다.");

	}

}
