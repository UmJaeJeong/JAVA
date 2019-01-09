package sec_verify11;

public class TaskExample {

	public static void main(String[] args) {
		Task[] ta = new Task[] {
				new Task("영어공부",30),
				new Task("수학공부",80),
				new Task("자바공부",150)
		};
		ta[0].setPriority(3);
		ta[1].setPriority(1);
		ta[2].setPriority(2);
		System.out.println("***나의 우선순위별 업무리스트***");
		System.out.println();
		System.out.println("일의 이름\t 소요시간(분)  우선순위");
		for(int i=0; i<3;i++) {
			System.out.println(ta[i].taskName+"\t "+ta[i].time+"소요시간(분)  우선순위"+ta[i].getPriority());

		}
	}

}
