package sec02_exam_method;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String animals = "dog/cat/bear";	   	//���� ���� �Է��� �ؾ��Ѵ�.
		String animals1 = "dog/cat,bear&abc";	//���� ���� �Է��� �ؾ��Ѵ�.
		
		//split�޼���� �Ű������� ����ǥ������ �´�. �Ͽ�
		//����ǥ������ ������ ���ڿ��� �����ϸ� String�迭�� ������
		String[] arr = animals.split("/");
		String[] arr2 = animals1.split("/|,|");
		
		for(String s: arr)
			System.out.println(s);
		System.out.println();
		
		for(String s : arr2)
			System.out.println(s);
		
	}

}
