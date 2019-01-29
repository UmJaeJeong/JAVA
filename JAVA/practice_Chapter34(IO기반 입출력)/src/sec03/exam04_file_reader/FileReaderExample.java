package sec03.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	// 만약에 XXXStream이 붙었다 그러면 byte기반
	// XXXReader or XXXWriter 붙었다 하면 char기반이다.
	public static void main(String[] args) throws Exception {
		// FileReader는 문자 단위로 읽기 때문에 , 텍스트가 아닌
		// 그림, 오디오, 비디오 등의 파잏은 읽을 수 없음을 알도록 하자.
		FileReader fr = new FileReader(
				"D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_reader\\FileReaderExample.java");
		int readCharNo;
		char[] cbuf = new char[10000];
		int i = 0;
		// 문자열을 읽으면 문자배열에 저장하고 읽은 문자바이트 수를 리턴한다.
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			i++;
		}
		System.out.write(13);
		System.out.println("루핑수 : " + i);
		fr.close();
	}

}
