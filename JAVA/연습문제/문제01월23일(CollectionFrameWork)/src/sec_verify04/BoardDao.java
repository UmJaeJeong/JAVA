package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> list = new ArrayList<>();
	public BoardDao() {
		list.add(new Board("이것이 자바다 ","신용권"));
		list.add(new Board("자바의 정석 ","남궁성"));
		list.add(new Board("명품 자바프로그래밍 ","황기태"));

	}
	public List<Board> getBoardList(){
		return list;
	}
}
