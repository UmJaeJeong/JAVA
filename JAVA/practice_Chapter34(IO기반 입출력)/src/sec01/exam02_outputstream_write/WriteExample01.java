package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		//파일로부터 출력스트림을 생성하여 대입한다(다형성)
		OutputStream os = new FileOutputStream("D:\\test.txt");	//일반예외 발생
		
		byte[] data = "ABC".getBytes();		//ABC라는 문자열에서 바이트 배열을 얻어낸다(인코딩)
		
		System.out.println(Arrays.toString(data));
		//3번 루핑
		for(int i = 0; i < data.length; i++)
			os.write(data[i]);
		
		//write()를 사용하면 무조건 flush()를 호출하여 메모리버퍼를 비우도록 하자.
		//물론, main()이 종료하면 알아서 나가지만 웬만하면 flush()를 하도록 하자
		os.flush();
		os.close();		//자원 해제
		
	}

}
