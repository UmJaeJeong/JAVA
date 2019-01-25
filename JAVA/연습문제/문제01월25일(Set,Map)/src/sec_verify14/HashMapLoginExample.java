package sec_verify14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");

		Scanner sc = new Scanner(System.in);
		String id = "";
		String passwd = "";
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			passwd =sc.nextLine();
			if (map.containsKey(id)) {
				if(passwd.equals(map.get(id))) {
					System.out.println();
					System.out.println(id+"님이 로그인 했습니다!");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
			}

		}
		sc.close();

	}

}
