package sec_verify01;

import java.util.Arrays;

public class ArrayExample01 
{
	public static void main(String[] args) 
	{
		 int[] array={5,10,88,1,-3}; //int 형 배열 선언 및 초기화
		  
	     Arrays.sort(array);   //sort 메소드를 이용한 정렬
	     
	     System.out.println(Arrays.toString(array));
	     Arrays.sort(array);   //sort 메소드를 이용한 정렬
	     
	     for(int i=0;i<array.length;i++)
	     {
	    	 System.out.println(array[i]);
	     }	     
	     System.out.println("["+Arrays.binarySearch(array, -3)+"]"); //4값이 들어있는 인덱스값 출력됨
	 }
}
