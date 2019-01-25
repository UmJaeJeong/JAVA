package sec_verify15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {
	final int INSERT = 1;
	final int DELETE = 2;
	final int SEARCH = 3;
	final int SHOWALL = 4;
	final int EXIT = 5;
	private Scanner sc;
	private HashMap<String, Phone> map;

	public PhoneBookApp() {
		map = new HashMap<>();
		sc = new Scanner(System.in);
	}

	public void run() {
		int input = 0;
		while (true) {
			System.out.print("1 : 삽입, 2 : 삭제, 3 : 찾기, 4. 전체 보기, 5. 종료 >>");
			input = sc.nextInt();
			sc.nextLine();

			if (input == EXIT)
				break;
			switch (input) {
			case INSERT:
				insert();
				break;
			case DELETE:
				delete();
				break;
			case SEARCH:
				search();
				break;
			case SHOWALL:
				showall();
				break;
			default:
				System.out.println("잘못입력하였습니다.");
			}
		}
		System.out.println("종료하였습니다.");
	}

	public void insert() {
		System.out.print("이름>>");
		String name = sc.nextLine();
		System.out.print("주소>>");
		String adress = sc.nextLine();
		System.out.print("전화번호>>");
		String telno = sc.nextLine();
		map.put(name, new Phone(name, adress, telno));
		System.out.println(name + "님이 저장되었습니다.");

	}

	public void delete() {
		System.out.print("이름>>");
		String str = sc.nextLine();
		if (!map.containsKey(str)) {
			System.out.println("등록되지 않은 사람입니다.");
		} else {
			map.remove(str);
			System.out.println(str + "님의 정보가 삭제되었습니다.");
		}
	}

	public void search() {
		System.out.print("이름>>");
		String str = sc.nextLine();
		sc.nextLine();
		if (!map.containsKey(str)) {
			System.out.println(str+"님은 등록되지 않은 사람입니다.");
		} else {
			System.out.printf(map.get(str).toString());
		}
		System.out.println();
	}

	public void showall() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("현재 저장되어 있는 고객 정보 리스트입니다.");
		while (it.hasNext()) {
			String str = it.next();
			Phone phone = map.get(str);
			System.out.printf(phone.toString());
			System.out.println();
		}
	}

}
