package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		//파일로부터 출력스트림을 생성하여 대입한다(다형성)
		OutputStream os = new FileOutputStream("D://test.txt");	//일반예외 발생
		byte[] data = "ABC가나다".getBytes();
		//byte[] data "ABC".getBytes();
		
		//바이트 배열을 한번에 스트림으로 보낸다. 하지만 시작인덱스가 1이고 길이는 2만큼 보낸다.
		System.out.println("data바이트배열의 크기 : " + data.length);
		os.write(data, 1, 2);	//BC만 test.txt파일에 저장됨.
		
		os.flush();		//write()를 사용하면 무조건 flush()를 호출하여 메모리버퍼를 비우도록 하자.
		os.close();		//자원 해제
	}

}
