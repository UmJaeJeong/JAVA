package sec1_verify08;

public class Shuffle {
	
	static int[] shuffle(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			int x = (int)(Math.random()*arr.length);
			int temp = arr[x];
			arr[x] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
