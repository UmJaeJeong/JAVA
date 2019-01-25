package sec_verify13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("������", 96);
		map.put("���ּ�", 86);
		map.put("�迬��", 92);
		map.put("��⸮", 88);
		map.put("��ȫ��", 90);
		map.put("���ֿ�", 44);
		map.put("����ȯ", 55);
		map.put("�ڼ���", 2);
		map.put("����ȣ", 9);
		map.put("����ȫ", 12);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		int min = 100;
		int max = 0;
		String min_name ="";
		String max_name ="";
		int sum = 0;
		while(it.hasNext()) {
			String str = (String)it.next();
			int score = map.get(str);
			sum +=score;
			if(min>score) {
				min = score;
				min_name = str;
			}
			
			if(max<score) {
				max = score;
				max_name = str;
			}
		}
		
		System.out.println("���� �л��� : "+map.size());
		System.out.println("������� : "+sum/map.size());
		System.out.println("�ְ� ���� : "+max);
		System.out.println("�ְ� ������ ���� ���̵� : "+max_name);
		System.out.println("���� ���� : "+min);
		System.out.println("���� ������ ���� ���̵� : "+min_name);
	}

}
