package sec03_exam_constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();//�⺻�����ڸ� ȣ��
		Data2 d2 = new Data2(3);//����(exception)�߻�? ����?
		
		d1.value = 10;
		System.out.println(d1.value);
		
		System.out.println(d2.value);


	}

}
