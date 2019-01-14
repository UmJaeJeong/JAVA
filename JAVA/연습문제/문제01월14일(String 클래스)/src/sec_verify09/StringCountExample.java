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
				"대구를 사랑합시다.대구!", "I like LG, I like Pizza!"
		};
		String src = "대구";
		
		for(String s : str) {
			System.out.println(s+"<---문자열에는 대구라는 단어가 총 "+count(src,s)+"번 있어요.");
		}
	}

}
