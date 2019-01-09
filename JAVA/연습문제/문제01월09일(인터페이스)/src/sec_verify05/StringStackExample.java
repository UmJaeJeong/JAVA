package sec_verify05;

public class StringStackExample {

	public static void main(String[] args) {
		StringStack ss = new StringStack(5);
		System.out.print("저장하고 싶은 문장을 입력하세요 :");
		ss.push("김용범");
		System.out.print("저장하고 싶은 문장을 입력하세요 :");
		ss.push("의 영어이름은");
		System.out.print("저장하고 싶은 문장을 입력하세요 :");
		ss.push("Kim");
		System.out.print("저장하고 싶은 문장을 입력하세요 :");
		ss.push("Yong");
		System.out.print("저장하고 싶은 문장을 입력하세요 :");
		ss.push("Bum");
		
		System.out.println("스택은 후입선출 개념입니다.(LIFO)");
		System.out.println("스택에 있는 문장들을 출력합니다.");
		System.out.println();
		for(int i=0; i<ss.length();i++) {
			System.out.println((i+1)+"번째 스택에 저장된 문장을 출력합니다.");
			System.out.println(ss.pop());
		}
	}

}
