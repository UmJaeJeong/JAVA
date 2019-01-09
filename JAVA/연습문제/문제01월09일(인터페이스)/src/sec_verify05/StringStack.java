package sec_verify05;

public class StringStack implements Stack{
	private String[] name;
	private int i=0;
	
	public StringStack(int idx) {
		System.out.println(idx+"개의 스택영역이 생성되었습니다.");	
		name = new String[idx];
	}

	@Override
	public int length() {
		return name.length;
	}

	@Override
	public Object pop() {
		String answer = name[i-1];
		name[i-1] = null;
		i--;
		return answer;
	}

	@Override
	public void push(Object obj) {
		name[i] = (String)obj;
		System.out.println();
		System.out.println(name[i]+"가 스택에 저장되었습니다.");
		System.out.println(name[i]+" 문장이 "+(++i)+"번째 스택에 저장되었습니다.");
		System.out.println();
	}
	
	
}
