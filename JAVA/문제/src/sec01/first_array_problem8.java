package sec01;

import java.util.Scanner;

public class first_array_problem8 {

	public static void main(String[] args) {
		
		String[] a = new String[] {"50000","10000","5000","1000","100","50","10","5","1"};
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int vlaue = sc.nextInt();
		
		for(int i=0; i<a.length;i++) {
			if(i!=5&& i!=7) {
			System.out.println(a[i]+"���� "+vlaue/Integer.parseInt(a[i]));
			vlaue %=Integer.parseInt(a[i]);
			}
		}
	}

}
