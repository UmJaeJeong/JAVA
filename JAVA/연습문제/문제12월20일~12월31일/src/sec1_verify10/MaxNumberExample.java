package sec1_verify10;

public class MaxNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {
				23, 72, 9, 54, 1747
		};
		MaxNumber n = new MaxNumber();
		System.out.println("�迭�� �ִ밪:"+n.max(arr));
		int[] arr1 = null;
		System.out.println("null���� ������:"+n.max(arr1));
		int[] arr2 = new int[0];
		System.out.println("ũ�Ⱑ 0�� �迭�� �ּҸ� ���� ��"+n.max(arr2));


	}

}
