package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> list = new ArrayList<>();
	public BoardDao() {
		list.add(new Board("�̰��� �ڹٴ� ","�ſ��"));
		list.add(new Board("�ڹ��� ���� ","���ü�"));
		list.add(new Board("��ǰ �ڹ����α׷��� ","Ȳ����"));

	}
	public List<Board> getBoardList(){
		return list;
	}
}
