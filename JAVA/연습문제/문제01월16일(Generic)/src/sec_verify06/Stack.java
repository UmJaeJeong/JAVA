package sec_verify06;

public class Stack<T> {
	int tos;
	int capacity;
	Object[] stack;
	
	public Stack(int capacity) {
		tos= 0;
		this.capacity = capacity;
		stack  = (T[])new Object[this.capacity];
	}
	
	public void push(T item) {
		try {
			stack[tos++] = item;
			System.out.println((tos)+"��° ��ü �� : "+(String)item);
		}catch(Exception e) {
			System.out.println("������ �� ã�׿�! ��ü�� �� �־��!\r\n" + 
					"���� �߻����� ���α׷��� ���� �����մϴ�.");
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+tos);
		}
		
	}
	
	public T pop(){
		
		if(tos == 0) {
			System.out.println("������ ����׿�. ���԰� �����. null�� ����ؿ�");
			return null;
		}
		tos--;
		return (T)stack[tos];
		
	}
}
