package sec_verify10;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) throws Exception{
		Vector<String> v = new Vector<>();
		File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA����\\0_words.txt_190129\\words.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter("\r\n");
			v.add(line);			
		}
		sc.close();
		
		String user = "";
		Scanner scc = new Scanner(System.in);
		while(true) {
			boolean flag = false;
			System.out.print("ã�´ܾ�>>");
			user = scc.nextLine();
			if(user.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			for(int i=0; i<v.size();i++) {
				if(user.length()>v.get(i).length()) {
					continue;
				}else if(user.length()<v.get(i).length()) {
					String tmp = v.get(i).substring(0, user.length());
					if(user.equals(tmp)) {
						System.out.println(v.get(i));
						flag = true;
					}
				}else {
					if(user.equals(v.get(i))) {
						System.out.println(v.get(i));
						flag = true;
					}
				}
			}
			if(!flag) System.out.println("ã�� �ܾ �����ϴ�.");
		}
		scc.close();
		
	}

}
