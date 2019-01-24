package sec02_set.exam02_HashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	//������
	public Member(String name, int age) {
		this.name = name;
		this.age= age;
	}

	/*
	 * ���ü�� ������ ObjectŬ���������� ������ �ٽ� �����ϸ�,
	 * 1���� �ΰ�ü�� �ؽ��ڵ尪�� �������� ����(hashcode������).
	 * 2��° �� ��ü�� �ʵ尪�� �� �������� ���� (equals������)
	 */
	
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			//Member�� �̸��� ���̰� �� ���ٸ� ���ü�� �ν��ϰ�true��  ������
			return (member.name.equals(this.name))&&(member.age==this.age);
		}
		//�ƴϸ� ���ü�� �ƴϴٶ�� ���� false�� ����
		return false;
	}
	
	@Override
	public int hashCode() {
		//�̸��� ���̸� ������ �ؽ��ڵ带 ����� ������.
		return Objects.hash(this.name, this.age);
	}
	
	
	//�Ʒ� �ؽ��ڵ�� ���� ȣȯ���� ���ؼ� �ۼ��Ҷ� ������ ����̴�.
/*	@Override
	public int hashCode() {
		//�̸��� ���̸� ������ �ؽ��ڵ带 ����� ������.
		return name.hashCode()+age;
	}*/
	
}
