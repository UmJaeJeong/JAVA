package sec_verify05;

public class StringStack implements Stack{
	private String[] name;
	private int i=0;
	
	public StringStack(int idx) {
		System.out.println(idx+"���� ���ÿ����� �����Ǿ����ϴ�.");	
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
		System.out.println(name[i]+"�� ���ÿ� ����Ǿ����ϴ�.");
		System.out.println(name[i]+" ������ "+(++i)+"��° ���ÿ� ����Ǿ����ϴ�.");
		System.out.println();
	}
	
	
}
