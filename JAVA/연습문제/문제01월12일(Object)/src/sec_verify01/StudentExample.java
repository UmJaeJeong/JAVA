package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		HashMap<Student, String> hashMap = new HashMap<>();
		hashMap.put(new Student("1"), "95");
		hashMap.put(new Student("2"), "100");
		hashMap.put(new Student("3"), "12");
		
		
		for(int i=1;i<=3;i++) {
			String an = Integer.toString(i);
			System.out.println(hashMap.get(new Student(an)).toString()+"Á¡");

		}
		
	}

}
