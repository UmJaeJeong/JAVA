package sec03_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Ű�� String, ���� IntegerŸ�� ���⼭ �Ѵ� ��ü��� �Ϳ� �ָ�����.
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * map�÷��ǿ� Ű�� ���� �ְ� �ִ�. "ȫ�浿"Ű�� 2�� �ڵ� �Ǿ��ִµ�,
		 * map�� �ߺ��� Ű�� �������� �ʴ´�. �Ͽ�, �������� put�� �� ������ ��ü�� ����  �ָ�����.
		 * ���� ���⼭ StringŸ���̱� ������ ���� hashcode()��
		 * equals()�� ������ ���� �ʾƵ� �ȴ�.(�̹� ���� �Ǿ��ִ�.)
		 */
		
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		//map.put("���屺",1000);
		
		//3���� ������ ���� ���� �ִ�.
		System.out.println("�� MapEntry �� : "+map.size());
		
		
		//���ο� ȫ�浿Ű�� 95��� ������ ��ü��
		System.out.println("ȫ�浿 : "+map.get("ȫ�浿"));
		System.out.println();
		
		//map�÷����� key�� Set���� �ٲ۴�.
		Set<String> keySet = map.keySet();
		//keySet�� ���� �ݺ���(Iterator)�� ��´�.
		Iterator<String> it = keySet.iterator();
		
		System.out.println("KeySet�� �̿��ؼ� �����");
		//������ Ű�� �ִ���?
		while(it.hasNext()) {
			//Ű�� StringŸ���̴ϱ� String���� �޴´�.
			String key = it.next();
			//���� Ű�� ���� ���´�(���� Integer, ��ڽ�)
			int value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		//Ű�� ȫ�浿�� MapEntry�� �����Ѵ�.
		map.remove("ȫ�浿");
		//System.out.println("ȫ�浿 : "+map.get("ȫ�浿"));
		//2���� ������ ���� ���� �ִ�.
		System.out.println("�� MapEntry �� : "+map.size());
		System.out.println();
		
		//map�÷����� Map.Entry��ü�� ������� Set���� �ٲ۴�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//entrySet�� ���� �ݺ��ڸ� ��´�.
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		System.out.println("entrySet�̿��ؼ� �����");
		while(entryIterator.hasNext()) {
			//������ �Ͷ�
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();	//Map.Entry�� key��ü�� ��´�.
			int value = entry.getValue();	//Map.Entry�� value��ü�� ��´�.
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		//��ü ��ü ����
		map.clear();
		System.out.println("�� MapEntry �� : "+map.size());
	}
}
