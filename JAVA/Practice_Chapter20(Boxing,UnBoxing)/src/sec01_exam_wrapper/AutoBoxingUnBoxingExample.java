package sec01_exam_wrapper;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동박식
		Integer obj = 100;
		Integer obj1 = new Integer(100);
		List<Integer> list = new Vector<>();
		list.add(100);	//컴파일시 (new Integer(100))l으로 바뀐다.
		list.add(obj);
		list.add(obj1);
		System.out.println("value : "+obj);
		System.out.println("value1 : "+obj1.intValue());
		System.out.println("value2: "+list.get(0));
		System.out.println("value에 저장되어 있는 값: "+list.toString());
		System.out.println();
		
		//대입시 자동언박싱(랩핑 되어 있는 100이 나와서 기본형에 저장되는 꼴)
		//int value = obj.intValue(); <-- 정확한 코딩코드
		int value = obj;
		System.out.println("vlaue3 : "+value);
		System.out.println();
		
		//연산시 자동언박싱
		//객체 + 기본형(원래 문법 에러이지만 랩퍼객체라서 컴파일러가
		//알아서 자동언박싱을 해주어 가능한 것이다.)
		int result = obj +100;
		System.out.println("result : "+result);

		
	}

}
