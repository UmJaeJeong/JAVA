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
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			passwd =sc.nextLine();
			if (map.containsKey(id)) {
				if(passwd.equals(map.get(id))) {
					System.out.println();
					System.out.println(id+"���� �α��� �߽��ϴ�!");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}

		}
		sc.close();

	}

}
