package sec01_firstArray;

public class Array_Example05 {

	public static void main(String[] args) {
		//�迭 ���� (���������� �����ϴ� ���)
		int[] arr = new int[5];
		//�迭 arr�� 1~5�� �����Ѵ�.
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		System.out.println("������ - arr.length :"+arr.length);
		for(int i =0; i<arr.length;i++) {
			System.out.println("arr["+i+"]"+arr[i]);

		}
		
		
		int[] tmp = new int[arr.length*2];
		//�迭 arr�� ����� ������ �迭 tmp�� �����Ѵ�.		
		for(int i=0; i<arr.length;i++) {
			tmp[i] = arr[i];
		}
		arr=tmp;//tmp�� ����� �ּҰ��� arr�� �����Ѵ�.
		System.out.println("������ - arr.length :"+arr.length);

		for(int i =0; i<arr.length;i++) {
			System.out.println("arr["+i+"]"+arr[i]);
		}
		System.out.println();
		for(int i =0; i<tmp.length;i++) {
			System.out.println("tmp["+i+"]"+tmp[i]);
		}

	}

}
