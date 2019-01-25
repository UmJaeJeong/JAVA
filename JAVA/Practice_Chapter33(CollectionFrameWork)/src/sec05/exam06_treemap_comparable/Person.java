package sec05.exam06_treemap_comparable;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	/*Comparable<>�� ������ �ִ� �߻�޼��带 �������ؾ߸�,
	treeSet�� ������������ ������ �ȴ�.
	�Ʒ��� ���� �ݴ�� �ϸ� ���������� �ȴ�.*/
	/*@Override
	public int compareTo(Person o) {
		if(this.age<o.age) {
			return -1;
		}else if(this.age>o.age) {
			return 1;
		}
		return 0;
	}*/
	
	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.name)<1) {
			return -1;
		}else if(this.name.compareTo(o.name)==0) {
			return 0;
		}
		return 1;
	}
	
	

}
