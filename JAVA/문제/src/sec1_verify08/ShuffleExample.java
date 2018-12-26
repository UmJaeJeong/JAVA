package sec1_verify08;

public class ShuffleExample {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print("[");
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}
			else {
			System.out.println(arr[i]+"]");
			}
		}
		
		Shuffle.shuffle(arr);
		System.out.print("[");
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}
			else {
			System.out.print(arr[i]+"]");
			}
		}
			
	}
}
