package sec_verify11;

public class TaskExample {

	public static void main(String[] args) {
		Task[] ta = new Task[] {
				new Task("�������",30),
				new Task("���а���",80),
				new Task("�ڹٰ���",150)
		};
		ta[0].setPriority(3);
		ta[1].setPriority(1);
		ta[2].setPriority(2);
		System.out.println("***���� �켱������ ��������Ʈ***");
		System.out.println();
		System.out.println("���� �̸�\t �ҿ�ð�(��)  �켱����");
		for(int i=0; i<3;i++) {
			System.out.println(ta[i].taskName+"\t "+ta[i].time+"�ҿ�ð�(��)  �켱����"+ta[i].getPriority());

		}
	}

}
