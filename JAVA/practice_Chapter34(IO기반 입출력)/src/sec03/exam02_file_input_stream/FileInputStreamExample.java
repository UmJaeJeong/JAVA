package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception{
		//FileInputStream("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam02_file_input_stream);
		//\는 이스케이프 문자기 때문에 아래와 같이 /로 바꿔준다.
		//현재 소스코드를 콘솔에 출력해보는 프로그램이다.
		FileInputStream fis = new FileInputStream("D:\\JAVA\\Practice_Chapter34(IO 기반 입출력)\\src\\sec03\\exam02_file_input_stream\\FileInputStreamExample.java");
		
		int data;
		int i=0;
		//한 바이트씩 읽는다.
		while((data = fis.read())!=-1) {
			System.out.write(data);
			//콘솔 출력System.out.print()사용, 한글은 2바이트이기 때문에
			//깨진다. 그렇기 때문에 바이트 배열로 하는것이 현명 하다.
			//System.out.print((char)data);
			i++;
			
		}
		System.out.println("루핑 수 :"+i);
		fis.close();
		
		
		
	}

}
