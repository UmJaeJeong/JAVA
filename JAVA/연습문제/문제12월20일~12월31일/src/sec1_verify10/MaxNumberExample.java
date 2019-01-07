package sec1_verify10;

public class MaxNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {
				23, 72, 9, 54, 1747
		};
		MaxNumber n = new MaxNumber();
		System.out.println("배열의 최대값:"+n.max(arr));
		int[] arr1 = null;
		System.out.println("null값을 줬을때:"+n.max(arr1));
		int[] arr2 = new int[0];
		System.out.println("크기가 0인 배열의 주소를 줬을 때"+n.max(arr2));


	}

}
