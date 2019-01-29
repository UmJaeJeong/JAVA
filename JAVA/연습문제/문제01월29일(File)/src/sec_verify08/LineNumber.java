package sec_verify08;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트 파일 이름을 입력하세요>>");
		String str = sc.nextLine();
		File file = new File(str);
		FileInputStream fis = new FileInputStream(file);
		int byte_file;
		String  ret = "";
		while((byte_file = fis.read())!=-1) {
			System.out.write(byte_file);
		}
		System.out.println(ret);
	}

}
