package sec2_verify05;

public class Document {
	static int count = 0;
	String name;
	
	Document(){
		count++;
		this.name ="제목없음"+count;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
	Document(String name){
		this.name = name+".txt";
		System.out.println("문서 "+this.name+"가 생성되었습니다.");

	}
}
