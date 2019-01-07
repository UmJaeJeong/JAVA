package sec01;

public class first_array_problem9 {

	public static void main(String[] args) {
		
		int[] code = new int[] {-9, -55, 73, 116, 101, 205, 1000};
		int[] arr = new int[10];
		
		for(int i=0; i<10;i++) {
			int x = (int)(Math.random()*6);
			arr[i] = code[x];
		}
		
		System.out.print("[");
		for(int i=0; i<arr.length;i++) {
			if(i!=arr.length-1)
			System.out.print(arr[i]+", ");
			else
			System.out.print(arr[i]+"]");

		}
	}

}
