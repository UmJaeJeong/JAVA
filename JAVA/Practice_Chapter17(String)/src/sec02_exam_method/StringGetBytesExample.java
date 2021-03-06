package sec02_exam_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//인코딩(컴퓨터가 알아보기 싶게 변환하는 과정)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length);
		
		//디코딩(사람이 알아보기 쉽게 변환하는 과정)
		String str1 = new String(bytes1);
		System.out.println("바이트 -> 문자열"+str);
		/*
		 * 기본적으로 문자셋은 이클립스는 EUC-KR이다 
		 * 한글은 기본적으로 2바이트  2*5 =10
		 * 그러므로 byte.lenght = 10
		 * 
		 * UTF-8에서 한글은 3바이트이다.
		 */
		
		
		try {
			//문자셋의 종류를 잘 선택하고 맞춰야 파일 송수신이나, 파일입출력할때 꺠짐 현상이 없다.
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.lengthj : "+bytes2.length);//10바이트인 이유?
			
			String str2 = new String(bytes2,"UTF-8");	//EUC-KR은 한글 2바이트 취급한다.
			System.out.println("바이트 -> 문자열 :"+str2);
			
			//깨짐
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.lengthj : "+bytes3.length);//15바이트 이뉴는?
 

			String str3 = new String(bytes3,"UTF-8"); //UTF-8 문자셋은 한글 한자를 3byte로 취급
			System.out.println("바이트 -> 문자열 :"+str3);


		} catch (UnsupportedEncodingException e) {

		}
		
		
		
	}

}
