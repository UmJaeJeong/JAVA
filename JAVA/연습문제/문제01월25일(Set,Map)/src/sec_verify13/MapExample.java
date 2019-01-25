package sec_verify13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신은혁", 96);
		map.put("김주성", 86);
		map.put("김연안", 92);
		map.put("김기리", 88);
		map.put("안홍범", 90);
		map.put("박주영", 44);
		map.put("안정환", 55);
		map.put("박성식", 2);
		map.put("윤두호", 9);
		map.put("엄기홍", 12);
		
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
		
		System.out.println("종합 학생수 : "+map.size());
		System.out.println("평균점수 : "+sum/map.size());
		System.out.println("최고 점수 : "+max);
		System.out.println("최고 점수를 받은 아이디 : "+max_name);
		System.out.println("최저 점수 : "+min);
		System.out.println("최저 점수를 받은 아이디 : "+min_name);
	}

}
