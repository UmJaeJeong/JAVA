package sec_verify06;

import java.util.Arrays;

public class MyVector {
	Object[] data = null; // 객체를 담기 위한 객체배열을 선언한다.
	private int capacity = 0; // 용량
	private int size = 0; // 크기
	
	public MyVector() {
		data = new Object[10];
		setCapacity(10);
	}
	
	public MyVector(int capacity) {
		data = new Object[capacity];
		ensureCapacity(capacity);
	}
	
	public boolean isEmpty() {
		if(capacity ==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int capacity() {
		return this.capacity;
	}
	
	public int size() {
		return this.size;
	}
	
	public void ensureCapacity(int minCapacity) {
		this.capacity = minCapacity;
	}
	
	public boolean add(Object obj) {
		if(capacity>=size) {
			data[size] = obj;
			size++;
			return true;
		}
		return false;
	}
	
	public Object get(int idx) {
		return data[idx];
	}
	
	public Object remove(int idx) {
		for(int i=idx;i<size;i++) {
			data[i] = data[i+1];
		}
		data[size-1] = null;
		size--;
		return data;
	}
	
	public boolean remove(Object obj) {
		if(size-1 !=0) {
			for(int i=0;i<size;i++) {
				data[i] = data[i+1];
			}
			data[size-1] = null;
			size--;
			return true;
		}
		return false;
		
	}
	
	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i=0; i<capacity;i++) {
			data[i] =null;
			
		}
		this.size = 0;
	}
	
	@Override
	public String toString() {
		String str = "[";
		for(int i=0;i<size;i++) {
			if(i!=size-1)
			str+=data[i]+",";
			else str+=data[i];
			
		}
		str+="]";
		return str;
	}
	
}
