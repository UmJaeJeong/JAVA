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
			System.out.print("1 : ����, 2 : ����, 3 : ã��, 4. ��ü ����, 5. ���� >>");
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
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		}
		System.out.println("�����Ͽ����ϴ�.");
	}

	public void insert() {
		System.out.print("�̸�>>");
		String name = sc.nextLine();
		System.out.print("�ּ�>>");
		String adress = sc.nextLine();
		System.out.print("��ȭ��ȣ>>");
		String telno = sc.nextLine();
		map.put(name, new Phone(name, adress, telno));
		System.out.println(name + "���� ����Ǿ����ϴ�.");

	}

	public void delete() {
		System.out.print("�̸�>>");
		String str = sc.nextLine();
		if (!map.containsKey(str)) {
			System.out.println("��ϵ��� ���� ����Դϴ�.");
		} else {
			map.remove(str);
			System.out.println(str + "���� ������ �����Ǿ����ϴ�.");
		}
	}

	public void search() {
		System.out.print("�̸�>>");
		String str = sc.nextLine();
		sc.nextLine();
		if (!map.containsKey(str)) {
			System.out.println(str+"���� ��ϵ��� ���� ����Դϴ�.");
		} else {
			System.out.printf(map.get(str).toString());
		}
		System.out.println();
	}

	public void showall() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("���� ����Ǿ� �ִ� �� ���� ����Ʈ�Դϴ�.");
		while (it.hasNext()) {
			String str = it.next();
			Phone phone = map.get(str);
			System.out.printf(phone.toString());
			System.out.println();
		}
	}

}
