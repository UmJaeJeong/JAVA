package sec02_set.exam02_HashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	//생성자
	public Member(String name, int age) {
		this.name = name;
		this.age= age;
	}

	/*
	 * 동등객체의 조건은 Object클래스에서도 했지만 다시 설명하면,
	 * 1번재 두객체의 해쉬코드값이 같은지를 보고(hashcode재정의).
	 * 2번째 두 객체의 필드값이 다 같은지를 본다 (equals재정의)
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
			//Member의 이름과 나이가 다 같다면 동등객체로 인식하고true를  리턴함
			return (member.name.equals(this.name))&&(member.age==this.age);
		}
		//아니면 동등객체가 아니다라고 보고 false를 리턴
		return false;
	}
	
	@Override
	public int hashCode() {
		//이름과 나이를 가지고 해쉬코드를 만들어 리턴함.
		return Objects.hash(this.name, this.age);
	}
	
	
	//아래 해쉬코드는 하위 호환성을 위해서 작성할때 유용한 방법이다.
/*	@Override
	public int hashCode() {
		//이름과 나이를 가지고 해쉬코드를 만들어 리턴함.
		return name.hashCode()+age;
	}*/
	
}
