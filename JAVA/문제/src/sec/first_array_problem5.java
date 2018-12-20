package sec;

import java.util.Scanner;

public class first_array_problem5 {

	public static void main(String[] args) {
		int[] numArr = new int[] {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<numArr.length;i++) {
			if(i!=numArr.length-1)
			System.out.print(numArr[i]+", ");
			else
			System.out.print(numArr[i]);

		}
		System.out.println();
		for(int i=0; i<numArr.length;i++) {
					int x = (int)(Math.random()*10);
					int y = (int)(Math.random()*10);
					int temp = numArr[x];
					numArr[x]=numArr[y];
					numArr[y] = temp;
		}
		for(int i=0; i<numArr.length;i++) {
			if(i!=numArr.length-1)
			System.out.print(numArr[i]+", ");
			else
			System.out.print(numArr[i]);

		}
		
	}

}
