package sec_verify09;

public class StringCountExample {
	public static int count(String src, String target) {
		int answer=0;
		while(target.indexOf(src)!=-1) {
			target = target.replaceFirst(src, " ");
			answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		
		String[] str = new String[] {
				"�뱸�� ����սô�.�뱸!", "I like LG, I like Pizza!"
		};
		String src = "�뱸";
		
		for(String s : str) {
			System.out.println(s+"<---���ڿ����� �뱸��� �ܾ �� "+count(src,s)+"�� �־��.");
		}
	}

}
