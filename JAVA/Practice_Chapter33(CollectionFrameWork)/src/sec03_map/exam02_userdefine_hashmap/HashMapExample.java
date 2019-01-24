package sec03_map.exam02_userdefine_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Ű�� Student(����� ���� ��ü), ������ Integer�� ���
		Map<Student, Integer> map = new HashMap<>();
		//�Ʒ� �ΰ��� Map.Entry�� ���ü�� �ȴ�. Ű�� ���� Student��ü�� sno��,
		//name�� ���� ����. �Ͽ� �������� ����� ������ ��ü�ȴ�.
		//������, hashCode()�� equals()�� �����Ǥ��� �ʾҴٸ�
		//�ٸ� ��ü�� �ν��Ͽ� ����ȴ�. �ֳĤ�? new�� �����ΰ�?
		map.put(new Student(1,"ȫ�浿"), 95);
		map.put(new Student(1,"ȫ�浿"), 90);
		map.put(new Student(2,"������"), 100);
		map.put(new Student(3,"���ּ�"), 58);
		
		System.out.println("�� Entry �� : "+map.size());
		System.out.println("ȫ�浿 : "+map.get(new Student(1,"ȫ�浿")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			System.out.println("Studnet(sno) : "+key.getSno()+","+"Studnet(name) : "+key.getName()+
					"Integer : "+map.get(new Student(key.getSno(),key.getName())));
		}
		System.out.println();
		//Map.Entry�� ���� �ڵ��غ���
		Set<Map.Entry<Student,Integer >> set_en = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> it = set_en.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Student, Integer> entry = it.next();
			System.out.println("Studnet(sno) : "+entry.getKey().getSno()+", Studnet(name) : "+entry.getKey().getName()+
					", Integer : "+entry.getValue());
		}

	}

}
