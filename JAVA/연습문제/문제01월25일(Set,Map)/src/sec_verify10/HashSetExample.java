package sec_verify10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		Iterator<String> it = set.iterator();
		int i=0;
		System.out.println("�� ��ü �� : "+set.size());
		System.out.println("�ݺ��ڸ� �� ����մϴ�.");
		while(it.hasNext()) {
			String str = it.next();
			System.out.println((++i)+"��° ��ü : "+ str);;
		}
		


		
	}

}
