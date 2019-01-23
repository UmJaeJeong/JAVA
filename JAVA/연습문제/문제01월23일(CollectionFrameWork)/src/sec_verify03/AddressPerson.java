package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {
	private ArrayList<Person> db;

	public AddressPerson() {
		db = new ArrayList<>();
	}

	public void print() {
		System.out.println("현재 고객리스트입니다.");
		System.out.println("--------------------------------------------------------------------");
		for(Person p : db) {
			System.out.println("이름 : "+p.getName()+", 나이 : "+p.getAge()+", 연락처 : "+p.getHandPhone());
		}
		System.out.println("--------------------------------------------------------------------");

	}

	public void insert(Person person) {
		String str = person.getName();
		boolean check = false;
		for(int i=0; i<db.size();i++) {
			Person p = db.get(i);
			if(str.equals(p.getName())) {
				check = true;
			}
		}
		
		if(!check) db.add(person);
		
	}
	

	public void delete(String name) {
		int idx = -1;
		for(int i=0; i<db.size();i++) {
			Person p = db.get(i);
			if(name.equals(p.getName())) {
				idx = i;
			}
		}
		if(idx ==-1) {
			System.out.println(name+"이라는 고객의 이름은 없습니다.");
		}else {
			db.remove(idx);
			System.out.println(name+" 고객을 삭제하였습니다.");
		}
	}

	public void update(String name, Person person) {
		int idx = -1;
		for(int i=0; i<db.size();i++) {
			Person p = db.get(i);
			if(name.equals(p.getName())) {
				idx = i;
			}
		}
		if(idx ==-1) {
			System.out.println(name+"이라는 고객의 이름은 없습니다.");
		}else {
			db.set(idx,person);
		}
		
	}
}
