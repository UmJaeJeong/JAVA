package sec01_firstArray;

import java.util.Arrays;

public class Array_Example03 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];//선언함. 0으로 자동초기화
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,96,80,70,60};//선언과 동시에 초기화
		int[] iArr4 = new int[] {100,96,80,70,60};//선언과 동시에 초기화
		
		char[] chArr = new char[] {'a','b','c','d'};
		
		//int arr[] = new int[50]
		//배열의 초기화값 확인
		System.out.println("배열 iArr1의 초기화 값 : ");
		
		for(int i=0; i<iArr1.length;i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		//배열명.length는 배열의 길이를 뜻함(C에서 존재하지 않음)
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i] = i+1;//1~10의 숫자를 순서대로 배열에 넣는다
		}
		
		for(int i=0; i<iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
			
		}
		//배열에 저장된 값들을 출력한다.
		for(int i=0; i<iArr1.length;i++) {
			if(i==9) {
				System.out.println(iArr1[i]);
			}
			else {
				System.out.println(iArr1[i]+",");
			}
		}
		System.out.println();
		//int[] 타입에서toString()호출시 String형태로 반환(API찾아보기)
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		//print()에서드 안에 참조형 변수가 오면 기본적으로 객체@16진수가 나온다.
		//그리고 참조형변수(레퍼런스)뒤에는 .toString()이 생략되어있다.
		System.out.println(Arrays.toString(iArr1));
		System.out.println(iArr3.toString());
		System.out.println(iArr3);
		System.out.println(chArr.toString());
		//char타임만 toString()을 호출해야 주소가 나오고,
		//toString()을 호출하지 아니하면 그냥 값들이 출력!!
		System.out.println(chArr.toString());
		System.out.println(chArr);


		
		
	}

}
