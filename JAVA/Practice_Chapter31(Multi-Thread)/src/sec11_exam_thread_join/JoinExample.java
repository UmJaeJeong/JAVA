package sec11_exam_thread_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		//sumThread�� run()�� ������ �ʾ����� getSum()�� ȣ���ϸ� 1~10000���� ����
		//��������� ������ ������.
		//�׷��� sumThread�� ���������� ��ٷ��ִ� �ڵ尡 �ʿ��ϴ�. �װ� �ٷ� join�̴�.
		//System.out.println("1~10000������ �� : "+ sumThread.getSum());
		try {
			sumThread.join();//���ν������ sumThread�� ���������� ��ٸ���.(�Ͻ�����)
		} catch (InterruptedException e) {}
		
		System.out.println("1~10000������ �� : "+ sumThread.getSum());	}

}
