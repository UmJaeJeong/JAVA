package sec_verify04;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		System.out.println("���� list�� ����Ǿ� �ִ� Board��ü���Դϴ�.");
		BoardDao dao =  new BoardDao();
		List<Board> li = dao.getBoardList();
		for(Board b : li) {
			System.out.println(b.getTitle()+" : "+b.getContent());
		}
		
		
	}

}
