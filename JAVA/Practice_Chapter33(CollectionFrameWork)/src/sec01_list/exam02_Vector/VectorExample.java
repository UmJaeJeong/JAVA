package sec01_list.exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// 저장되는 객체가 사용자 정의 타입인 Board가 된다.
		Vector<Board> list = new Vector<>();
		System.out.println(list.capacity());
		// 객체추가
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 0;
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 1;
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 2;
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 3;
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 4;
		
		list.remove(2);
		list.remove(3);
		list.ensureCapacity(20);	//용량만 확보 
		
		//setSize()호출되면서 기존의 capacity를 2배로 늘리고, size를 15로 잡음.
		list.setSize(list.size()*2);//NullPointerException이 발생함
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		list.trimToSize();
		
		//list와 set에는 Iterator가 존재한다. 
		//반복자
		Iterator<Board> it = list.iterator();
		
		while(it.hasNext()) {
			Board board = it.next();
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
	/*	for(int i=0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		for(Board board : list) {
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		*/

	}

}
