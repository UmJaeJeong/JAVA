package sec_verify08;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ؽ�Ʈ ���� �̸��� �Է��ϼ���>>");
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
