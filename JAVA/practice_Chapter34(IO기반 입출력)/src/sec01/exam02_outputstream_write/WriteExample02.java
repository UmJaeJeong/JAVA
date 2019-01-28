package sec01.exam02_outputstream_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		//파일로부터 출력스트림을 생성하여 대입한다(다형성)
		OutputStream os = new FileOutputStream("D:\\test.txt");	//일반예외 발생
		
		//"ABC가나다"라는 문자열에서 바이트 배열을 얻어낸다(인코딩)
		byte[] data = "ABC가나다".getBytes("UTF-8");
		
		//바이트배열을 한번에 스트림으로 보낸다. 앞선 write(int b)메서드에 비해 훨씬 효율적이다.
		System.out.println("data바이트배열의 크기 : " + data.length);
		os.write(data);
		os.flush();		//write()를 사용하면 무조건 flush()를 호출하여 메모리버퍼를 비우도록 하자.
		
		InputStream is = new FileInputStream("D:\\test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		int i = 0;
		//InputStream의 read(byte[] b)메서드는 읽을게 더이상 없다면,
		//-1값을 리턴함.
		while((readByteNo = is.read(readBytes)) != -1) {
			i++;
			String str = new String(readBytes, "UTF-8");
			System.out.println("읽은 값 : " + str);
			System.out.println("읽은 바이트수 : " + readByteNo);
		}
		System.out.println("루핑수 : " + i);
		os.close();	//자원 해제
		is.close();
	}

}
