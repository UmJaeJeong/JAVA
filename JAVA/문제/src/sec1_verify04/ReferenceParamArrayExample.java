package sec1_verify04;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		System.out.println("정렬 전 배열값입니다.");
		printArr(arr);
		System.out.println();
		System.out.println("정렬 후 배열값입니다.");
		sortArr(arr);
		printArr(arr);
		System.out.println();
		System.out.println("배열의 합계입니다.");
		System.out.println("sum="+sumArr(arr));
	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i = 0; i<arr.length;i++)
			if(i!=arr.length-1)
			System.out.print(arr[i]+",");
			else System.out.print(arr[i]);
		System.out.print("]");

	}
	static int sumArr(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		}
	
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				//버블정렬
				if(arr[j]>arr[j+1]) {
					int temp  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
