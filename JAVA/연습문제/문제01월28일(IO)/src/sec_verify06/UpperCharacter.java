package sec_verify06;

import java.io.File;
import java.io.FileReader;

public class UpperCharacter {

	public static void main(String[] args) throws Exception{
		File file = new File("C:\\problem6.txt");
		FileReader fr = new FileReader(file);
		String content = "";
		int rd= 0;
		while((rd = fr.read())!=-1) {
			content += (char)rd;
		}
		content = content.toUpperCase();
		System.out.println(content);
		
		
		
		
	}

}
