package sec_verify01;

public class ContainerExample {
	
	public static void main(String[] arges) {
		Container<String> c1 = new Container<>();
		c1.setT("ȫ�浿");
		System.out.println("<T>Ÿ���Ķ���Ϳ� <String>���� ��ü ���� �� ���尪 : "+c1.getT());
		
		Container<Integer> c2 = new Container<>();
		c2.setT(150);
		System.out.println("<T>Ÿ���Ķ���Ϳ� <Integer>���� ��ü ���� �� ���尪 : "+c2.getT());
		

	}

}
