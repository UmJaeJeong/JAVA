package sec_verify01;

import java.util.Arrays;

public class ArrayExample01 
{
	public static void main(String[] args) 
	{
		 int[] array={5,10,88,1,-3}; //int �� �迭 ���� �� �ʱ�ȭ
		  
	     Arrays.sort(array);   //sort �޼ҵ带 �̿��� ����
	     
	     System.out.println(Arrays.toString(array));
	     Arrays.sort(array);   //sort �޼ҵ带 �̿��� ����
	     
	     for(int i=0;i<array.length;i++)
	     {
	    	 System.out.println(array[i]);
	     }	     
	     System.out.println("["+Arrays.binarySearch(array, -3)+"]"); //4���� ����ִ� �ε����� ��µ�
	 }
}
