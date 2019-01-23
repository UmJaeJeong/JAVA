package sec_verify04;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		System.out.println("현재 list에 저장되어 있는 Board객체들입니다.");
		BoardDao dao =  new BoardDao();
		List<Board> li = dao.getBoardList();
		for(Board b : li) {
			System.out.println(b.getTitle()+" : "+b.getContent());
		}
		
		
	}

}
