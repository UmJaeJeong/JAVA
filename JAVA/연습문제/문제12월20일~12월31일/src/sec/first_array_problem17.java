package sec;

import java.util.Scanner;

public class first_array_problem17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[] {1.1, 2.2, 6.6, 4.4, 5.5, 4.4, 3.3, 4.4, 2.2, 3.3};
		double[] Arr = new double[10];
		
		int k=0;
		boolean find =false;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<Arr.length;j++) {
				if(arr[i]==Arr[j]) {
					find = true;
					break;
				}
				
			}
			if(!find) {
				Arr[k]=arr[i];
				k++;	
			}

		}
		
		for(int i=0; i<k;i++) {
			System.out.print(Arr[i]+" ");
		}
	}

}
