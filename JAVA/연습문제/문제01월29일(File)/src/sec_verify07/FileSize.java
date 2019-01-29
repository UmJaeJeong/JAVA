package sec_verify07;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {

		File file = new File("C:\\");
		File[] file1 = file.listFiles();
		long max = 0;
		String max_name = "";
		for (int i = 0; i < file1.length; i++) {
			if (file1[i].exists())
				if (max < file1[i].length()) {
					max = file1[i].length();
					max_name = file1[i].getName();
				}
		}

		System.out.println("가장 큰 파일은 " + max_name + " " + max + "바이트");

	}
}
