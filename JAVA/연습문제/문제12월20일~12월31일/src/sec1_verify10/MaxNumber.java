package sec1_verify10;

public class MaxNumber {
	public int max(int[] arr) {
		int max = -999999;
		if(arr != null &&arr.length!=0) {
			for(int i=0; i<arr.length;i++) {
				if(max<arr[i])max = arr[i];
			}
		}
		return max;
	}
}
