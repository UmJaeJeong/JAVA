package sec04.exam03_bufferdinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{

		long start = 0;
		long end = 0;

		// 바이트 기반으로 속도의 차이를 보기 위한 프로그램이다.
		// (선생님 PC에서는 233배정도 차이가 난다. 역시 PC의 사양에 따라 차이는 존재할 것이다./)
		FileInputStream fis1 = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg");

		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis(); // 읽기전 시간 지정
		// 그냥 읽기만한다.
		while ((fis1.read()) != -1) {
		}
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때(바이트기반) : " + (end - start) + "ms");
		fis1.close();
		
		System.out.println();
		//주입력 스트림 FileInputStream에다가 속도형향상 보조스트림인 BufferedInputSTream을 연결함.
		//혹시 잘못 이해할수도 있는데, BufferedInputStream은 보조 스트림이기 때문에 파일을
		//읽어올수가 없다.
		FileInputStream fis2 = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam03_file_output_stream\\KakaoTalk_20190106_042323052.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		System.out.println("버퍼기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용할 경우(버퍼기반) : " + (end - start) + "ms");
	}

}
