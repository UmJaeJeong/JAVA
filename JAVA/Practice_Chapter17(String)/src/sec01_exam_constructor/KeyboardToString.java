package sec01_exam_constructor;

import java.io.IOException;
import java.util.Arrays;

public class KeyboardToString {
	// JVM에게 예외를 던짐
	public static void main(String[] args) {
		byte[] bytes = new byte[100];// 기본값 0으로 셋팅
		System.out.print("입력 : ");
		// 키보드로 입력받는다.(입력받는 바이트수를 리텅)
		int readByteNo;

		try {
			readByteNo = System.in.read(bytes);

			String str = new String(bytes, 0, readByteNo - 2);
			// byte[] b = str.getBytes("UTF-8");
			byte[] b = str.getBytes("EUC-KR"); //기본적으로 EUC-KR로 되어있다 
			System.out.println("Stringrkqt : "+str);
			System.out.println("byte[] 값 :"+Arrays.toString(b));
			System.out.println("입력받은 바이트 수"+readByteNo);
		} catch (IOException e) {
			
		}

	}

}
