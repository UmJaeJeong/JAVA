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
			System.out.println((tos)+"번째 객체 값 : "+(String)item);
		}catch(Exception e) {
			System.out.println("스택이 꽉 찾네요! 객체를 못 넣어요!\r\n" + 
					"예외 발생으로 프로그램을 정상 종료합니다.");
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+tos);
		}
		
	}
	
	public T pop(){
		
		if(tos == 0) {
			System.out.println("스택이 비었네요. 개게가 없어요. null을 출력해요");
			return null;
		}
		tos--;
		return (T)stack[tos];
		
	}
}
